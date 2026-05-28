class Solution {
    public boolean isHappy(int n) {
        if (n == 1) return true;
        Set<Integer> seen = new HashSet<>();
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n = sumOfDigits(n);
        }
        return n==1;
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