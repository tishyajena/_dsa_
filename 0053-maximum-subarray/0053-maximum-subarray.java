class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int maxLen = Integer.MIN_VALUE;

        for(int i = 0; i <n; i++){
            sum+=nums[i];
            maxLen = Math.max(maxLen, sum);
            if(sum<0){
                sum = 0;
            }
        }
        
        return maxLen;
    }
}