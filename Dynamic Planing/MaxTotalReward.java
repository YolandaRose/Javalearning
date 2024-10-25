package dynamicPlaning;

import java.util.Arrays;
import java.util.HashMap;

public class MaxTotalReward {
	/*
	 * 失败
	 * public static int maxTotalReward(int[] rewardValues) { //先排序
	 * Arrays.sort(rewardValues); int max=0,n=0; //先存入哈希表方便查找
	 * HashMap<Integer,Integer> map=new HashMap<>(); for (int num:rewardValues){
	 * map.put(num,n); n++; } //动态规划 int curMax=max; for(int
	 * i=0;i<rewardValues.length;){ if(rewardValues[i]>max){ int
	 * curTotal=max+rewardValues[i]; int j=1; while((!map.containsKey(curTotal+j))
	 * && (curTotal+j)<=rewardValues[n-1]){ j++; } if((curTotal+j)>
	 * rewardValues[n-1]) {//找到界限 max=curMax; i++; } else {
	 * i=map.get(curTotal+j);//得到序号 curTotal+=rewardValues[i]; }
	 * curMax=curTotal>curMax?curTotal:curMax; } else i++;
	 * 
	 * } max=curMax; return max; }
	 */
	
	public static int maxTotalReward(int[] rewardValues) {
        //先排序
        Arrays.sort(rewardValues);
        int m=rewardValues[rewardValues.length-1];
        //记 rewardValues 的最大值为 m，因为最后一次操作前的总奖励一定小于等于 m−1
        //所以可获得的最大总奖励小于等于 2m−1
        int[] dp = new int[2*m];//共2m个位置
        dp[0]=1;//表示不执行任何操作获得总奖励 0

        for(int x: rewardValues){
            for(int k=2*x-1;k>=x;k--){
                //倒叙
                if(dp[k-x] == 1){//表示有数能够相加得到k
                    dp[k] = 1;//k也能得到别的
                }
            }
        }

        int res=0;
        for(int i=0;i<dp.length;i++){
            if(dp[i]==1){
                res=i;
            }
        }
        return res;
    }
	public static void main(String[] args) {
		int []rewardValues= {1,6,4,3,2};
		System.out.println(maxTotalReward(rewardValues));

	}

}
