package leetcode;

import java.util.Stack;

public class Huiwen_Linklist_3 {
	public static ListNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addFirst(0);
		addFirst(0);
		addFirst(1);
		Solution s=new Solution();
		System.out.println(s.isPalindrome(head));
	}
	//头插法
	public static void addFirst(int data) {
		ListNode node= new ListNode(data);
		node.next=head;
		head=node;
	}

}
class Solution {
    public boolean isPalindrome(ListNode head) {
    	if(head.next==null)return true;
       //找到中线并入栈
       Stack<Integer> stack=new Stack<>();
        while(head.val!=head.next.val && head.next!=null){
            stack.push(head.val);//入栈
            
            head=head.next;
            if(head.next==null)return false;
            
        }
        //对比回文
        if(head.val==head.next.val){
            //不用对比当前的，直接从下一个开始对比
            head=head.next.next;
            while(head!=null && !stack.isEmpty()){
                if(stack.pop()==head.val){
                    head=head.next;
                }else return false;
            }
            if(head==null && stack.isEmpty())return true;
        }
        return false;
        
    }
}