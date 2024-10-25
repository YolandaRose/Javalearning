package leetcode;

public class Merge2lists {

	public static void main(String[] args) {
		// l1 = [1,2,4], l2 = [1,3,4]
		//输出：[1,1,2,3,4,4]

	}

}
class Solution_3 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //递归
        if(list1==null)return list2;
        else if(list2==null) return list1;
        else if(list1.val<list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
        }else{
            list2.next=mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
}