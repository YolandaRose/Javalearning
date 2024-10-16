# List

- List 是一个接口，它继承自 Collection 接口。List 接口代表一个有序的元素序列，允许元素重复。
- List 接口的具体实现类：ArrayList， LinkedList， Vector， Stack。

## ArrayList

- **适用于需要频繁随机访问元素的情况**
- 数据结构：底层是**动态数组**。当数组容量不足时，它会创建一个更大的数组，并将旧数组的元素复制过去。
- 访问速度：随机访问，访问任意元素的时间复杂度是 **O(1)**（常数时间）。这是因为通过索引直接定位到内存中的元素位置。
- 内存占用：内存连续存储，除了元素本身，没有额外的存储开销。但由于动态数组可能需要扩容，可能会浪费一些内存空间。

## LinkedList

- **适用于需要频繁插入和删除元素的情况**
- 数据结构：底层是**双向链表**，每个元素都包含指向前后元素的指针。
- 访问速度：访问任意元素的时间复杂度是 **O(n)**，因为要遍历链表找到目标元素（特别是当访问后面的元素时，需要一个个顺着指针查找）。
- 内存占用：由于每个节点都要存储额外的前后指针，所以内存开销较大。对于每个元素，除了数据本身，还需要额外的 8 个字节的存储空间。

## List 接口方法

eg.`List<String> list = new ArrayList<>();`

- 添加元素：`add()`
        list.add("apple");
        list.add("banana");
        list.add("orange");
- 获取元素：`get()`
        list.get(0); // 返回第一个元素(apple)
- 删除元素：`remove()`
        list.remove(0); // 删除第一个元素(apple)
- 元素个数：`size()`
        list.size(); // 返回元素个数(3)
- 遍历列表：
        for(String fruit:list){
            System.out.println(fruit); // 输出apple banana orange
        }

## Vector

类似于 ArrayList，但是是线程安全的。如果在多线程环境下使用列表，可以考虑使用 Vector。

## Stack

是继承自 Vector 的类，表示堆栈数据结构，支持入栈和出栈操作。
