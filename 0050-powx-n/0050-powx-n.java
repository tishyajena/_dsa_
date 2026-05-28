class Solution {
    public double myPow(double x, int n) {
        long exp = n;
        if(exp<0){
            x = 1/x;
            exp = -exp;
        }
        double res = 1.0; //base case
        while(exp>0){
            if((exp & 1) == 1){
                res = res*x;
            }
            x = x*x;
            exp >>= 1;
            // if((exp % 2) == 1){
            //     res = res*x;
            // }
            // x = x*x;
            // exp = exp / 2;
        }
        return res;

    }
}