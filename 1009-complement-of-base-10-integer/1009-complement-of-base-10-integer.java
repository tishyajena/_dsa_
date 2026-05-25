class Solution {
    public int bitwiseComplement(int n) {
        if( n == 0) return 1;
        if(n == 1) return 0;
        String s1 = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i) == '0'){
                sb.append('1');
            }
            else{
                sb.append('0');
            }
        }
        int res = Integer.parseInt(sb.toString(),2);
        return res;
    }
}