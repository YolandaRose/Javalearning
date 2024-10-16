# Deque(Double-Ended Queue)

- Deque是一个双端队列接口，继承自Queue接口，Deque的实现类是LinkedList、ArrayDeque、LinkedBlockingDeque，其中LinkedList是最常用的。
- Deque有三种用途：

    **普通队列(一端进另一端出)**:
    `Queue queue = new LinkedList()`或`Deque deque = new LinkedList()`

    **双端队列(两端都可进出)**:
    `Deque deque = new LinkedList()`

    **堆栈**
    `Deque deque = new LinkedList()`
- 此接口定义在双端队列**两端访问元素**的方法。提供插入、移除和检查元素的方法。- 每种方法都存在两种形式：一种形式在操作失败时**抛出异常**，另一种形式返回一个**特殊值**（null 或 false，具体取决于操作）。

## 常用方法

1.头部

- 插入
抛出异常：`addFirst(e)`
返回特殊值：`offerFirst(e)`
- 移除
抛出异常：`removeFirst()`
返回特殊值：`pollFirst()`
- 检查
抛出异常：`getFirst()`
返回特殊值：`peekFirst()`

2.尾部

- 插入
抛出异常：`addLast(e)`
返回特殊值：`offerLast(e)`
- 移除
抛出异常：`removeLast()`
返回特殊值：`pollLast()`
- 检查
抛出异常：`getLast()`
返回特殊值：`peekLast()`
