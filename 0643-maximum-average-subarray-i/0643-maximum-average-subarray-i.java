class Solution {
    public double findMaxAverage(int[] nums, int k) {

        //--------BRUTE FORCE----------
        // double maxAvg = Double.NEGATIVE_INFINITY;

        // //valid range start point till n-k
        // for(int i = 0; i<=nums.length-k; i++){
        //     double sum = 0;

        //     for(int j = i; j<i+k;j++){
        //         sum+=nums[j];
        //     }

        //    maxAvg = Math.max(maxAvg, sum/k);
        // }

        // return maxAvg;

        //--------OPTIMAL APPROACH--------
        double sum = 0;
        for(int i = 0; i<k; i++) sum+=nums[i];
        double maxSum = sum;

        for(int i = k; i<nums.length; i++){
            sum = sum + nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum/k;

    }
}