package basic;

public class CreateList {
	public ListNode head;//链表头
	
	public static void main(String[] args) {
		

	}
	//头插法
	public void addFirst(int data) {
		ListNode node= new ListNode(data);
		node.next=this.head;
		this.head=node;
	}

	//尾插法
	public void addLast(int data) {
		ListNode node= new ListNode(data);
		if(this.head==null) {
			this.head=node;
		}else {
			ListNode cur=this.head;
			while(cur.next!=null) {
				cur=cur.next;
				
			}
			cur.next=node;
		}
	}
	
	//打印链表
	public void display() {
		ListNode cur=this.head;
		while(cur!=null) {
			System.out.print(cur.val+" ");
			cur=cur.next;
		}
		System.out.println();
	}
	//查找关键字Key是否在链表中
	public boolean contains(int key) {
		ListNode cur=this.head;
		while(cur!=null) {
			if(cur.val==key) {
				return true;
			}
			cur=cur.next;
			
		}
		return false;
	}
	//得到单链表长度
	public int Size() {
		int count=0;
		ListNode cur=this.head;
		while(cur!=null) {
			count++;
			cur=cur.next;
		}
		return count;
	}
	//任意位置插入
	public void addIndex(int index,int data) {
		if(index<0||index>Size()) {//判断index位置的合法性
			return ;
		}
		if(index==0) {
			//头插法
			addFirst(data);
			return;
		}
		if(index==Size()) {
			//尾插法
			addLast(data);
			return;
		}
		ListNode cur=findIndex(index);//找到index位置前一位置地址
		ListNode node=new ListNode(data);//初始化node
		node.next=cur.next;
		cur.next=node;
	}
	//找到index位置
	public ListNode findIndex(int index) {
		ListNode Index=new ListNode(index);
		return Index;
	}
	//删除第一次出现关键字为key的节点
	public void remove(int key) {
		
	}
}
//链表结构
class ListNode{
	public int val;
	public ListNode next;
	
	//构造函数
	public ListNode(int a) {
		this.val=a;
	}
}
