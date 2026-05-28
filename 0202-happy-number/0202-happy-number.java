class Solution {
    public boolean isHappy(int n) {
        if (n == 1) return true;
        List<Integer> generated = new ArrayList<>();

        generated.add(n);
        
        while(true){
            n = sumOfDigits(n);
            if(n == 1) return true;
            for(int num: generated){
                if(num == n) return false;
            }
            generated.add(n);
        } 
    }
    private int sumOfDigits(int num){
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum+= digit*digit;
            num/=10;
        }
        return sum;
    }
}