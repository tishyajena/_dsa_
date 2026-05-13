class Solution {
    public String reverseWords(String s) {
        String [] a = s.strip().split("\\s+");
        
        StringBuilder sb = new StringBuilder();
        System.out.println(a[0]);
        for(int i = a.length-1; i>=1; i--){
            sb.append(a[i]);
            sb.append(" ");
        }
        sb.append(a[0]);
        
        
        String ans = sb.toString();
        return ans;

    }
}