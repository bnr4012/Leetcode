class Solution {
    public boolean containsDuplicate(int[] nums) {
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1] || nums[i]==nums[nums.length-1]){
        //         return true;
        //     }
        // }
        // return false;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        //optimal solution
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}