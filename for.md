# for 循环

`for(String str : strs)` 是一种增强的 `for` 循环（也称为“for-each”循环），用于遍历集合或数组。它的语法如下：

```java
for (元素类型 变量名 : 集合或数组) {
    // 循环体
}
```

在`for(String str : strs)`中：

- `String` 是元素的类型，表示每个元素都是一个字符串。
- `str` 是循环变量，用于接收 `strs` 中的每个元素。
- `strs` 是要遍历的集合或数组，它可以是一个字符串数组、一个列表或任何其他实现了 `Iterable` 接口的集合。

示例代码：

```java
String[] strs = {"apple", "banana", "cherry"};

for (String str : strs) {
    System.out.println(str);
}
```

这个循环将遍历 `strs` 数组中的每个字符串，并将其打印出来。
