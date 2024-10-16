# Array类方法

`Arrays` 类在 Java 中提供了许多静态方法，用于操作数组。以下是一些常用的方法：

1. **排序数组**：

   ```java
   Arrays.sort(array);
   ```

2. **二分查找**：

   ```java
   int index = Arrays.binarySearch(array, key);
   ```

   这个方法要求数组已经被排序。

3. **填充数组**：

   ```java
   Arrays.fill(array, value);
   Arrays.fill(array, fromIndex, toIndex, value);
   ```

   用指定的值填充整个数组或指定范围的数组。

4. **复制数组**：

   ```java
   int[] newArray = Arrays.copyOf(originalArray, newLength);
   int[] newArray = Arrays.copyOfRange(originalArray, fromIndex, toIndex);
   ```

5. **比较两个数组**：

   ```java
   boolean isEqual = Arrays.equals(array1, array2);
   ```

6. **数组转字符串**：

   ```java
   String arrayString = Arrays.toString(array);
   ```

   也可以使用 `Arrays.deepToString(array)` 来处理多维数组。

7. **检查数组是否包含特定元素**：

   ```java
   boolean contains = Arrays.asList(array).contains(element);
   ```

   这要求数组被转换为 `List`，然后使用 `contains` 方法。

8. **比较数组的哈希码**：

   ```java
   int hashCode = Arrays.hashCode(array);
   ```

这些方法可以帮助你在 Java 中处理数组的各种操作，提供了许多便捷的功能来简化代码。
