class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();

        for(String s: strs){
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);

            if(!mp.containsKey(str)){
                mp.put(str, new ArrayList<>());
            }
            mp.get(str).add(s);
        }
        return new ArrayList<>(mp.values());
        
    }
}