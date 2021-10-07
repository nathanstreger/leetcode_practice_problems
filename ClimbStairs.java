public class ClimbStairs {
    //Leetcode 70
    public int climbStairs(int n) {
        //Pattern follows the Fibonacci Numbers.
        
        int f[] = new int[n + 2];
        int i;
        
        f[0] = 1;
        f[1] = 1;
        
        for (i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        
        return f[n];
    }
}
