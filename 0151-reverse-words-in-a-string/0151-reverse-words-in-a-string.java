class Solution {
    public String reverseWords(String s) {
        String [] s1 = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = s1.length-1; i>=1; i--){
            sb.append(s1[i]);
            sb.append(" ");
        }
        return sb.append(s1[0]).toString();
    }
}