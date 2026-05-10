class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] res = s.split(" ");
        if(res.length != pattern.length()) return false;
        HashMap<String, Character> map = new HashMap<>();
        int i = 0;
        for(String x: res){
            if(!map.containsKey(x) && !map.containsValue(pattern.charAt(i))){
                map.put(x,pattern.charAt(i++));
            }
            else if (map.containsKey(x) && map.get(x) == pattern.charAt(i) ){
                i++;
            }
            else return false;
        }
        return true;
    }
}