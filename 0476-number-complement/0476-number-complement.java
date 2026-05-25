class Solution {
    public int findComplement(int num) {
        if(num == 1 || num == 0) return 0;
        StringBuilder sb = new StringBuilder();
        String s1 = Integer.toBinaryString(num);
        
        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i) == '1'){
                sb.append('0');
            }
            else{
                sb.append('1');
            }
        }
        
        int res = Integer.parseInt(sb.toString(),2);

        return res;

    }
}