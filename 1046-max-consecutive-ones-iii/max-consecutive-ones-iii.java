class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        int zc=0;
        int n=nums.length;
        int l=0;
        for(int r=0;r<n;r++){
            if(nums[r]==0){
                zc++;
            }
            while(zc>k){
                if(nums[l]==0){
                    zc--;
                }
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}