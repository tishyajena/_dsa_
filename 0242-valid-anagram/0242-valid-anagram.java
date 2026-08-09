class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()) return false;
       int []freq = new int[26];
       for(char x : s.toCharArray()){
        freq[x-'a']++;
       }
       for(char x: t.toCharArray()){
        freq[x-'a']--;
       }
       for(int i = 0; i<25; i++){
        if(freq[i] != 0){
            return false;
        }
       }
       return true;
    }
}