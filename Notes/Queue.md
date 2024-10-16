# Queue

- 队列是一种线性数据结构，它的特点是先进先出。在队列中，元素的添加（入队）操作在队尾进行，而元素的移除（出队）操作则在队头进行。
- Java中，队列接口继承自Collection接口，并提供了丰富的方法来操作队列中的元素。
- 常用方法：
1.添加元素
- add()：添加元素到队列尾部。
- offer()：尝试添加元素到队列尾部，成功返回true，失败返回false。
2.移除元素
- remove()：移除队列头部的元素。
- poll()：尝试移除队列头部的元素，成功返回元素，失败返回null。
3.获取头部元素
- element()：获取队列头部的元素，如果队列为空，抛出异常。
- peek()：获取队列头部的元素，如果队列为空，返回null。
4.其他方法
- size()：获取队列中元素的个数。
- isEmpty()：判断队列是否为空。
- clear()：清空队列。
- contains()：判断队列中是否包含元素o。

```java
Queue<String> queue = new LinkedList<>();
queue.add("apple");
queue.add("banana");
queue.add("orange");

System.out.println(queue.peek()); // apple
```

## 接口和实现类

- 最常用的包括LinkedList、ArrayDeque和PriorityQueue等。这些实现类都实现了Queue接口

### LinkedList

- LinkedList是Java中常用的**双向链表**实现，它同时实现了List接口和Queue接口，因此可以被用作队列来进行**元素的添加和移除**操作。

```java
Queue<String> queue = new LinkedList<>();
queue.offer("a");//入队
queue.offer("b");
String element = queue.poll(); //出队
System.out.println(element); // a
```

### ArrayDeque

- ArrayDeque是Java中一种**基于数组的双端队列**实现，实现了Queue接口，并且在**尾部添加和移除元素**的操作具有较低的时间复杂度。

```java
Queue<String> queue = new ArrayDeque<>();
queue.offer(1);//入队
queue.offer(2);
String element = queue.poll(); //出队
System.out.println(element); // 1
```

### PriorityQueue

- PriorityQueue是一个**基于优先级堆**的无界优先队列实现，可以按照元素的**自然顺序或者自定义顺序来进行元素的添加和移除**操作，确保每次出队的元素都是队列中优先级最高的元素。
- **不是线程安全的**
- 它为add和poll方法提供了**O(log n)**的时间复杂度

```java
Queue<Integer> queue = new PriorityQueue<>();
queue.offer(10);
queue.offer(5);
queue.offer(15);
int element = queue.poll(); //出队
System.out.println(element); // 5（根据自然顺序出队）
```
