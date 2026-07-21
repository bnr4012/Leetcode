class Solution {
    public int singleNumber(int[] nums) {
      int count=1;
      int xor=0;
      for(int i=0;i<nums.length;i++){
        xor=xor^nums[i];
      }
      return xor;
    }
}