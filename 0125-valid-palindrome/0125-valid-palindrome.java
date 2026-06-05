class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                char x = Character.toLowerCase(ch);
                sb.append(x);
            }
        }
        StringBuilder sb2 = new StringBuilder(sb);
        return sb2.reverse().toString().equals(sb.toString());
    }
}