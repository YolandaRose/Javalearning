# Stack

- 栈是Vector的一个子类，它实现了一个标准的后进先出的栈。
- 堆栈只定义了默认构造函数，用来创建一个空栈。 堆栈除了包括由Vector定义的所有方法，也定义了自己的一些方法。

## 方法

1.boolean empty()：判断栈是否为空，如果为空，返回true，否则返回false。
2.Object peek()：返回栈顶元素，但不弹出栈顶元素。
3.Object pop()：弹出栈顶元素，并返回该元素。
4.void push(Object obj)：压入一个元素到栈顶。
5.int search(Object obj)：查找一个元素在栈中的位置，如果找到，返回该元素在栈中的位置，否则返回-1。(1为基数)

```java
import java.util.Stack;
 
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
 
        // 压入元素到栈中
        stack.push(10);
        stack.push(20);
        stack.push(30);
 
        // 弹出栈顶元素，并删除
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
 
        // 查看栈顶元素，但不删除
        int peekedElement = stack.peek();
        System.out.println("Peeked element: " + peekedElement);
 
        // 判断栈是否为空
        boolean empty = stack.isEmpty();
        System.out.println("Is the stack empty? " + empty);
 
        // 搜索元素在栈中的位置
        int position = stack.search(20);
        System.out.println("Position of 20 in the stack: " + position);
    }
}
```
