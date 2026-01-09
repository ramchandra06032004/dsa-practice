class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        return f(nums1,nums2,0,0,new Integer[nums1.length+1][nums2.length+1]);
    }
    public int f(int[] num1,int[] num2,int i1,int i2,Integer[][] dp){
        if(i1==num1.length || i2==num2.length){
            return Integer.MIN_VALUE;
        }
        if(dp[i1][i2]!=null){
            return dp[i1][i2];
        }
        int take=num1[i1]*num2[i2];
        int next=f(num1,num2,i1+1,i2+1,dp);
        int skipI1=f(num1,num2,i1,i2+1,dp);
        int skipI2=f(num1,num2,i1+1,i2,dp);
        if (next!=Integer.MIN_VALUE) {
            next+=take;
        }
        int max=Math.max(take,Math.max(next,Math.max(skipI1,skipI2)));
        return dp[i1][i2] = max;
        
    }
}