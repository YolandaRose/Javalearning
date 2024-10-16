# HashMap

在Java中，**哈希表（Hash Table）**通常是通过类如 `HashMap` 或 `Hashtable` 来实现的。它们通过**键值对**（key-value pairs）存储数据，并且允许通过键快速查找对应的值。**哈希表**的核心思想是使用**哈希函数**将键映射到一个哈希码，并通过哈希码来存储和检索值。

## 使用 `HashMap` 的基本步骤

1. **创建哈希表**：可以使用 `HashMap` 类来创建哈希表。
2. **添加元素**：通过 `put(key, value)` 方法向哈希表中添加键值对。
3. **获取元素**：通过 `get(key)` 方法根据键获取对应的值。
4. **检查键或值的存在**：使用 `containsKey(key)` 或 `containsValue(value)` 方法检查哈希表中是否存在某个键或值。
5. **删除元素**：使用 `remove(key)` 方法删除某个键及其对应的值。

### `HashMap` 使用示例

```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // 创建一个HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // 向HashMap中添加键值对
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 30);

        // 根据键获取对应的值
        System.out.println("apple的数量: " + map.get("apple"));  // 输出: apple的数量: 10

        // 检查键是否存在
        if (map.containsKey("banana")) {
            System.out.println("banana存在");
        }

        // 删除键值对
        map.remove("orange");

        // 遍历HashMap
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
```

### 代码解释

1. **创建HashMap**：`HashMap<String, Integer> map = new HashMap<>();`  
   创建一个 `HashMap`，键的类型是 `String`，值的类型是 `Integer`。

2. **添加元素**：`map.put("apple", 10);`  
   向哈希表中插入键 `"apple"`，对应的值是 `10`。

3. **获取元素**：`map.get("apple");`  
   根据键 `"apple"`，返回对应的值 `10`。

4. **检查键存在**：`map.containsKey("banana");`  
   检查键 `"banana"` 是否存在于 `HashMap` 中。

5. **删除元素**：`map.remove("orange");`  
   删除键 `"orange"` 及其对应的值。

6. **遍历HashMap**：通过 `keySet()` 获取所有的键，然后通过 `get(key)` 获取对应的值。

## `HashMap` 的常见操作

- **put(key, value)**: 向哈希表中插入键值对。如果键已经存在，则更新值。
- **get(key)**: 根据键获取值。如果键不存在，返回 `null`。
- **remove(key)**: 根据键删除键值对。
- **containsKey(key)**: 检查哈希表中是否存在指定的键。
- **containsValue(value)**: 检查哈希表中是否存在指定的值。
- **size()**: 返回哈希表中键值对的数量。
- **isEmpty()**: 检查哈希表是否为空。
- **clear()**: 清空哈希表。
- **keySet()**: 返回所有键的集合。
- **values()**: 返回所有值的集合。
- **entrySet()**: 返回所有键值对的集合。
- **getOrDefault(key, defaultValue)**: 根据键获取值，如果键不存在，返回默认值。
- **computeIfAbsent(key, mappingFunction)**: 如果键不存在，则调用 `mappingFunction` 函数来计算值，并插入到哈希表中。
- **computeIfPresent(key, remappingFunction)**: 如果键存在，则调用 `remappingFunction` 函数来计算新值，并插入到哈希表中。
- **forEach(action)**: 遍历哈希表，并对每个键值对调用 `action` 函数。
- **equals(Object)**: 比较两个 `HashMap` 是否相等。

### 注意事项

- `HashMap` 允许 `null` 键和 `null` 值。
- `HashMap` 是**非线程安全的**，如果需要线程安全的哈希表，可以使用 `ConcurrentHashMap` 或 `Hashtable`。

### 哈希表的工作原理

- 当调用 `put(key, value)` 时，`HashMap` 会根据键的哈希码将该键值对存储在对应的哈希槽中。
- 当调用 `get(key)` 时，`HashMap` 会根据键的哈希码快速找到对应的哈希槽，从而获取值。

哈希表最主要的优点是它能以近乎常数时间复杂度（O(1)）进行插入和查找操作，因此在需要高效查找时非常有用。
