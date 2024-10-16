# String类方法

1. **获取字符串长度**：

   ```java
   int length = str.length();
   ```

2. **获取子字符串**：

   ```java
   String substr = str.substring(beginIndex, endIndex);
   ```

3. **替换字符或子字符串**：

   ```java
   String replaced = str.replace('a', 'b');
   String replacedSubstr = str.replace("old", "new");
   ```

4. **转换为大写或小写**：

   ```java
   String upper = str.toUpperCase();
   String lower = str.toLowerCase();
   ```

5. **去除前后空白**：

   ```java
   String trimmed = str.trim();
   ```

6. **检查是否包含子字符串**：

   ```java
   boolean contains = str.contains("substring");
   ```

7. **检查字符串是否以特定前缀或后缀开始或结束**：

   ```java
   boolean startsWith = str.startsWith("prefix");
   boolean endsWith = str.endsWith("suffix");
   ```

8. **索引位置**：

   ```java
   int indexOf = str.indexOf('a');
   int lastIndexOf = str.lastIndexOf('a');
   ```

9. **分割字符串**：

   ```java
   String[] parts = str.split("delimiter");
   ```

10. **连接字符串**：

    ```java
    String concatenated = str.concat("additionalString");
    ```

11. **比较字符串**：

    ```java
    boolean isEqual = str.equals("anotherString");
    boolean isEqualIgnoreCase = str.equalsIgnoreCase("anotherString");
    ```

12. **获取字符数组**：

    ```java
    char[] charArray = str.toCharArray();
    ```

这个方法返回一个新的 `char` 数组，其中包含字符串中的每个字符。
例如，给定一个字符串 `str`，`str.toCharArray()` 将返回一个 `char` 类型的数组，其中每个元素都是字符串中的一个字符。

示例代码：

```java
String str = "hello";
char[] array = str.toCharArray();

for (char c : array) {
    System.out.println(c);
}
```

在这个例子中，`str.toCharArray()` 将返回一个 `char` 数组 `array`，其内容是 `{'h', 'e', 'l', 'l', 'o'}`。然后，使用增强的 `for` 循环遍历这个数组并打印每个字符。

13.**格式化字符串**：

```java
String formatted = String.format("Hello, %s!", "world");
```

14.**获取字符串的字节表示**：

```java
byte[] bytes = str.getBytes();
```
