class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        int freq1[]= new int[26];
        int freq2[]=new int[26];
        for(int i=0;i<word1.length();i++){
            char ch1=word1.charAt(i);
            freq1[ch1-'a']++;
        }
        for(int i=0;i<word2.length();i++){
            char ch2=word2.charAt(i);
            freq2[ch2-'a']++;
        }
        for(int i=0;i<26;i++){
            if(!(Math.abs(freq1[i]-freq2[i])<=3)){
                return false;
            }
        }
        return true;
    }
}