class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()) return false;
       int []freqS = new int[26];
       int []freqT = new int[26];
       for(char x : s.toCharArray()){
        freqS[x-'a']++;
       }
       for(char x: t.toCharArray()){
        freqT[x-'a']++;
       }
       for(int x: freqS){
        System.out.print(x + " ");
       }

       for(int x: freqT){
        System.out.print(x + " ");
       }
       for(int i = 0; i<26; i++){
        if(freqS[i] != freqT[i]){
            return false;
        }
       }
       return true;
    }
}