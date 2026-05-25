class Solution {
    public int findComplement(int num) {
        if(num == 1 || num == 0) return 0;
        StringBuilder sb = new StringBuilder();
        while(num>0){
            int temp = num%2;
            sb.append(String.valueOf(temp));
            System.out.println(sb);
            num = num/2;
        }
        
        for(int i = 0; i<sb.length(); i++){
            if(sb.charAt(i) == '1'){
                sb.setCharAt(i, '0');
            }
            else{
                sb.setCharAt(i, '1');
            }
        }
        
        double res = 0;
        for(int i = 0; i<sb.length(); i++){
            int x = sb.charAt(i) - '0';
            res  = res + x * Math.pow(2, i);
        }

        return (int)res;

    }
}