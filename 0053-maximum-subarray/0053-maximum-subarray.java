class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSub = Integer.MIN_VALUE;
        // if(n == 1){
        //     maxSub = nums[0];
        //     return maxSub;
        // }
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum+=nums[i];
            maxSub = Math.max(sum, maxSub);
            if(sum<0){
                sum = 0;
            }
        }
        return maxSub;
    }
}