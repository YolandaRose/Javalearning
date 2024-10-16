# HashSet

在Java中，**`HashSet`** 和 **`HashMap`** 都是基于哈希表的数据结构，但它们有一些显著的区别：

## 1. `HashSet` 的使用

`HashSet` 是一个用于存储**唯一元素**的集合，它不允许重复的元素，并且没有指定元素的顺序。由于 `HashSet` 使用哈希表来存储数据，查找、插入和删除操作的时间复杂度一般为 O(1)。

### `HashSet` 的基本操作

- **添加元素**：`add(element)` 将元素添加到集合中，如果元素已存在，则不会添加。
- **删除元素**：`remove(element)` 将指定元素从集合中移除。
- **检查元素是否存在**：`contains(element)` 检查集合中是否存在某个元素。
- **获取集合大小**：`size()` 返回集合中元素的个数。

### `HashSet` 示例

```java
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // 创建一个HashSet
        HashSet<String> set = new HashSet<>();

        // 添加元素
        set.add("apple");
        set.add("banana");
        set.add("orange");

        // 添加重复元素不会生效
        set.add("apple");

        // 检查元素是否存在
        if (set.contains("banana")) {
            System.out.println("banana 存在");
        }

        // 删除元素
        set.remove("orange");

        // 遍历HashSet
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // 获取集合大小
        System.out.println("集合大小: " + set.size());
    }
}
```

对于 set 集合中的每一个 String 类型的元素，将其临时赋值给变量 fruit。
在每次循环中，fruit 代表集合 set 中的一个元素，然后在循环体内，你可以对这个元素进行操作（例如在这里通过 System.out.println(fruit) 输出它）。
fruit 并不需要在代码的其他地方提前定义，它是仅在循环内作用的临时变量，随着每次迭代，fruit 的值会自动更新为集合中的下一个元素。

## 2. **`HashMap` 和 `HashSet` 的区别：**

- **数据存储方式**：
  - `HashSet` 只存储元素，没有键值对。
  - `HashMap` 是通过**键值对（key-value pairs）**存储数据的，每个键都是唯一的，键映射到一个值。

- **内部实现**：
  - `HashSet` 是基于 `HashMap` 实现的，实际上每个 `HashSet` 内部维护了一个 `HashMap`。当你向 `HashSet` 中添加元素时，`HashSet` 会将元素作为 `HashMap` 的键，值为一个常量对象（通常为 `PRESENT`）。
  
- **允许的元素**：
  - `HashSet` 只存储唯一的对象，不允许重复元素。
  - `HashMap` 允许一个键映射一个值，但不允许重复的键。同一个键可以更新其对应的值。

- **用法场景**：
  - 使用 `HashSet` 当你只关心集合中的唯一元素，且不需要关联值。
  - 使用 `HashMap` 当你需要通过键查找对应的值或存储键值对。

## `HashMap` 和 `HashSet` 实现区别示例

```java
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // HashSet 只存储元素
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");

        // HashMap 存储键值对
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.put("banana", 20);

        System.out.println("HashSet: " + set);
        System.out.println("HashMap: " + map);
    }
}
```

### 总结

- **`HashSet`** 是用于存储唯一元素的集合。
- **`HashMap`** 是用于存储键值对的数据结构，键是唯一的，值可以重复或更新。
- `HashSet` 内部实际上使用了 `HashMap` 来存储元素，它只使用了 `HashMap` 的键来存储实际元素。
