package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class RemoveNthFromEnd {
	public static ListNode head;
	//头插法
	public static void addFirst(int data) {
		ListNode node= new ListNode(data);
		node.next=head;
		head=node;
	}
	 public ListNode removeNthFromEnd_1(ListNode head, int n) {
	        //栈：弹出栈的第 n 个节点就是需要删除的节点
	        ListNode dummy=new ListNode(0,head);
	        Deque<ListNode> stack = new LinkedList<>();
	        ListNode cur=dummy;
	        while(cur!=null){
	            stack.push(cur);
	            cur=cur.next;
	        }
	        for(int i=0;i<n;i++){
	            stack.pop();
	        }
	        ListNode pre=stack.peek();
	        pre.next=pre.next.next;
	        ListNode ans=dummy.next;
	        return ans;

	    }
	 public static ListNode removeNthFromEnd(ListNode head, int n) {
	        //两个指针相隔n-1即可扫描一遍删除
			//特殊情况
	        if(head==null)return head;
	        if(head.next==null && n==1)return null;
	        
	        //正常情况
	        ListNode ptr=head,q=head;
	        for(int i=0;i<n && ptr!=null;i++){
	            ptr=ptr.next;
	        }
	        if(ptr==null)return head.next;//说明要删第一个
	        
	        while(ptr.next!=null){
	            ptr=ptr.next;
	            q=q.next;
	        }
	        
	        q.next=q.next.next;
	        return head;
	    }
	public static void main(String[] args) {
		addFirst(5);
		addFirst(4);
		addFirst(3);
		addFirst(2);
		addFirst(1);
		ListNode res=removeNthFromEnd(head,2);
		System.out.println(res.val);
	}

}