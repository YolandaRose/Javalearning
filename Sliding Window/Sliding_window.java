package sliding_window;

import java.util.Deque;
import java.util.LinkedList;

public class Sliding_window {
	public static void main(String[] args) {
		int[] nums=new int[] {1,3,-1,-3,5,3,6,7};
		int k=3;
		int[] res = new int[nums.length - k + 1];
		Solution solution=new Solution();
		res=solution.maxSlidingWindow(nums,k);
		for(int a:res) {
			System.out.println(a);
		}
	}
}
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || k==0)return new int[0];//特殊情况
        Deque<Integer> deque = new LinkedList<>();//双端队列
        int[] res = new int[nums.length-k+1];//共有nums.lenth-k+1个窗口，保存每个窗口最大值
        for(int j =0,i=1-k;j<nums.length;i++,j++){
        	//j当前遍历数组位置，i窗口起始位置
        	//初始i<0,窗口还没滑入有效位置
        	
            //删除已经滑出窗口的最大值，deque中对应的nums[i-1]
            if(i>0 && deque.peekFirst() == nums[i-1]){
                deque.removeFirst();
            }
            
            //从队尾开始，删除所有比当前 nums[j] 小的元素，因为它们不可能成为当前窗口或之后窗口的最大值。
            //保持deque递减
            while(!deque.isEmpty() && deque.peekLast() < nums[j]){
                deque.removeLast();
            }
            deque.addLast(nums[j]);
            
            //当窗口完全进入有效范围（i >= 0），就可以记录当前窗口的最大值。
            //由于 deque 保持了递减顺序，因此队首元素 deque.peekFirst() 就是当前窗口的最大值。
            if(i >= 0){
                res[i]=deque.peekFirst();
            }
        }
        return res;
        

    }
}