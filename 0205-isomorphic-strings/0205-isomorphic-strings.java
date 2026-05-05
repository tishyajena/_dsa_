class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        if (s.length() == 1 && t.length() == 1) return true;
        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            if(!freq1.containsKey(s.charAt(i))){
                freq1.put(s.charAt(i), i);
            }
            if(!freq2.containsKey(t.charAt(i))){
                freq2.put(t.charAt(i), i);
            }
            if(!freq1.get(s.charAt(i)).equals(freq2.get(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}