class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        char[] str = s.toCharArray();
        int l = 0;
        int maxLen = 0;
        int res = 0;

        for(int r = 0; r<str.length; r++){
            map.put(str[r], map.getOrDefault(str[r],0)+1);
            maxLen = Math.max(maxLen, map.get(str[r]));
            
            while((r-l+1) - maxLen > k){
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }

            res = Math.max(res, r-l+1);
        }
        return res;
    }
}