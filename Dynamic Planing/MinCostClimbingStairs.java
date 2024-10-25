package dynamicPlaning;

public class MinCostClimbingStairs {

	public static void main(String[] args) {
		int[] cost= {1,100,1,1,1,100,1,1,100,1};
		Solution_3 solution=new Solution_3();
		System.out.println(solution.minCostClimbingStairs(cost));
	}

}

/*
 * class Solution_2 { public int minCostClimbingStairs(int[] cost) { int
 * current=cost.length; if(current<2)return cost[0]; int
 * i=current-1,j=current-2;//从倒数两格开始 int total=0; while(current>1){
 * if(cost[i]<cost[j])current=i; else current=j; total+=cost[current];
 * i=current-1;j=current-2; } return total;
 * 
 * } }
 * failed!不能只考虑局部最优解，{0,2,2,1}解出来就不是最小的！
 */
class Solution_2 {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n+1];//dp[n]为到第n级最小花费
        dp[0]=dp[1]=0;
        for(int i=2;i<=n;i++){
            dp[i]=Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        return dp[n];
    }
}
//进一步优化：使用滚动数组
class Solution_3 {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int pre=0,curr=0;//pre为前一次操作，curr为当前
        for(int i=2;i<=n;i++){
            //next为后一次操作
            int next=Math.min(curr+cost[i-1],pre+cost[i-2]);
            pre=curr;
            curr=next;
        }
        return curr;
    }
}