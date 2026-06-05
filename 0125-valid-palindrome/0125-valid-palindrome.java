class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                char x = Character.toLowerCase(ch);
                sb.append(x);
            }
        }
        int i = 0;
        int j = sb.length()-1;
        while(i<j){
            if(sb.charAt(i) != sb.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }
}