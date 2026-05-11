class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int [] freqS = new int[26];
        int [] freqP = new int[26];
        ArrayList<Integer> res = new ArrayList<>();

        for(char ch: p.toCharArray()){
            freqP[ch-'a']++;
        }

        for(int i = 0; i<s.length(); i++){
            freqS[s.charAt(i)-'a']++;
            
            if(i>=p.length()){
                freqS[s.charAt(i-p.length())-'a']--;
            }
            if(Arrays.equals(freqP, freqS)){
                res.add(i-p.length()+1);
            }
        }
        return res;
    }
}