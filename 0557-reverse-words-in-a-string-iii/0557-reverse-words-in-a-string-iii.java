class Solution {
    public String reverseWords(String s) {
        String [] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s1: str){
            for(int i = s1.length()-1; i>=0; i--){
                sb.append(s1.charAt(i));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}