class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();

       //here array elements are keys and the indexes are the values
       for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            int pI=map.get(nums[i]);
            if(i-pI<=k){
                return true;
            }
        }
        map.put(nums[i],i);
       }
       return false;
    }
}