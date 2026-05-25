class Solution {
    public int missingNumber(int[] nums) {
        
        int sum_actual = 0;
        int n = nums.length;
        int sum_expected = (n*(n+1))/2;
        for(int i = 0; i<n; i++){
            sum_actual = sum_actual + nums[i];
        }
        return sum_expected-sum_actual;
    }
}