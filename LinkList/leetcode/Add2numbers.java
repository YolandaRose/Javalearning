package leetcode;

public class Add2numbers {

	public static void main(String[] args) {
		// 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
		// 输出：[8,9,9,9,0,0,0,1]

	}

}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head =null,tail=null;
        int carry=0;
        while(l1!=null || l2!=null){
            int n1=l1!=null?l1.val:0;
            int n2=l2!=null?l2.val:0;
            int sum=n1+n2+carry;
            if(head ==null){
                head=tail=new ListNode(sum%10);
            }
            else{
                tail.next=new ListNode(sum%10);
                tail=tail.next;
            }
            carry=sum/10;
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }
        if(carry>0){
            tail.next=new ListNode(carry);
        }
        return head;
    }
}