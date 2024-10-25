package dynamicPlaning;

import java.util.Scanner;

public class ClimbStairs_3 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n=scanner.nextInt();
			Solution_1 solution=new Solution_1();
			System.out.println(solution.climbStairs(n));
		}

	}

}
/*递归（超时）
 * class Solution { public int climbStairs(int n) { if(n==0 || n==1)return 1;
 * else return climbStairs(n-1)+climbStairs(n-2); } }
 */
class Solution_1 {
    public int climbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q; 
            q = r; 
            r = p + q;
        }
        return r;
    }
}
