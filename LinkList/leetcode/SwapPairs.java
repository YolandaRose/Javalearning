package leetcode;

public class SwapPairs {
	public static ListNode head;
	//头插法
	public static void addFirst(int data) {
			ListNode node= new ListNode(data);
			node.next=head;
			head=node;
	}
	
	public static ListNode swapPairs(ListNode head) {
        //特殊情况
        if(head==null||head.next==null)return head;
        //正常情况
        ListNode p=head,q=head.next,tmp=head.next.next;
        if(tmp==null) {//只有2个数字的情况
        	q.next=p;
        	p.next=null;
        	return q;
        }
        head=head.next;
        while(tmp!=null){
            
            if(tmp.next!=null){
            	q.next=p;
            	p.next=tmp;
            	p.next=tmp.next;
                p=tmp;
                
                q=tmp.next;
                if(q.next!=null) {
                	tmp=q.next;
                }else{
                    q.next=p;
                    p.next=null;
                    return head;
                }
            }else { 
            	q.next=p;
            	p.next=tmp;
            	return head;
            
            }
        }
        return head;

    }
	public static void main(String[] args) {
		addFirst(5);
		addFirst(4);
		addFirst(3);
		addFirst(2);
		addFirst(1);
		ListNode res=swapPairs(head);
		while(res!=null) {
			System.out.print(res.val+" ");
			res=res.next;
		}
	}

}
