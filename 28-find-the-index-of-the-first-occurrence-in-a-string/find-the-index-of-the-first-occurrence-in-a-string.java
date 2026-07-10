class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
      
        for(int i=0;i<=n-m;i++){
            String p=haystack.substring(i,i+needle.length());
            if(p.equals(needle)){
                return i;
            }
        }
        return -1;
        //re
    }
    
}