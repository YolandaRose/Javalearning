package leetcode;

public class ReverseKGroup {
	public static ListNode head;
	
	//头插法
		public static void addFirst(int data) {
				ListNode node= new ListNode(data);
				node.next=head;
				head=node;
		}
    public static ListNode reverseKGroup(ListNode head, int k) {
        //递归
    	//判断链表长度是否足够
        ListNode P=head;
        for(int i=0;i<k;i++){
        	if(P==null)return head;//不足k个直接返回
            //找到最后一个
            P=P.next;
        }
        
        //翻转
        ListNode cur=head,pre=null;
        for(int i=0;i<k;i++){
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
      
        //递归下一组
        head.next=reverseKGroup(cur,k);
        //返回翻转后的新头结点
        return pre;
    }
    
	public static void main(String[] args) {
		addFirst(5);
		addFirst(4);
		addFirst(3);
		addFirst(2);
		addFirst(1);
		ListNode res=reverseKGroup(head,3);
		while(res!=null) {
			System.out.print(res.val+" ");
			res=res.next;
		}

	}

}
