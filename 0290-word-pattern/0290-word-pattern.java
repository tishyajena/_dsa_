class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<String,Character> map = new HashMap<>();
        String[] pat = s.split(" ");
        int i = 0;
        if(pattern.length()!= pat.length) return false;
        for(String str: pat){
            if(!map.containsKey(str) && !map.containsValue(pattern.charAt(i))){
                map.put(str, pattern.charAt(i));
                i++;
            }
            else if(map.containsKey(str) && map.get(str)==pattern.charAt(i)){
                i++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}