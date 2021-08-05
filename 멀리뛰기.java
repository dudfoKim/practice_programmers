class Solution
{
    public long solution(int n)
    {        
        if(n<3)
        {
            return n;
        }
        
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = dp[1] + 1;

        for(int i=3; i<=n; i++)
        {
            dp[i] = (dp[i-1] + dp[i-2])%1234567;
        }
        
        return dp[n]%1234567;
    }
}
