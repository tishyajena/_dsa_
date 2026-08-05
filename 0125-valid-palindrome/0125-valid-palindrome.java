class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char x: s.toCharArray()){
            if(Character.isLetter(x) || Character.isDigit(x)){
                sb.append(Character.toLowerCase(x));
            }
        }
        int i = 0;
        int j = sb.length()-1;

        while(i<j){
            if(sb.charAt(i) != sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }


        return true;
    }
}