class Solution {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            sb.append(s.charAt(i));
        }
        for(int i = 0; i<s.length(); i++){
            sb.append(s.charAt(i));
        }
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);

        return sb.toString().contains(s);


    }
}