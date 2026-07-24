class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int wSum=0;
        for(int i=0;i<k;i++){
            wSum+=nums[i];
        }
        max=wSum;
        for(int i=k;i<n;i++){
            wSum=wSum-nums[i-k]+nums[i];
            max=Math.max(wSum,max);
        }
        return (double)max/k;

    }
}