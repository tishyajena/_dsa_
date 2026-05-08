class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int []sf = new int[26];
        int []tf = new int[26];

       
        //freq of s
        for(char a : s.toCharArray()){
            sf[a-'a']++;
        }
        //freq of t
        for(char b : t.toCharArray()){
            tf[b-'a']++;
        }

        boolean flag = true;
        for(int i = 0; i<26; i++){
            if (sf[i] != tf[i]){
                flag = false;
            }
        }
        return flag;
    }
}