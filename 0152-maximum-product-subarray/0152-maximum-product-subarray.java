class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int currProd = 1;
        int maxProd = Integer.MIN_VALUE;

        //check forward once
        for(int i = 0; i<n; i++){
            currProd*=nums[i];
            maxProd = Math.max(currProd, maxProd);
            if(currProd == 0){
                currProd = 1;
            }
        }

        //check backward once
        currProd = 1;
        for(int i = n-1; i>=0; i--){
            currProd*=nums[i];
            maxProd = Math.max(currProd, maxProd);
            if(currProd == 0){
                currProd = 1;
            }
        }
        return maxProd;
    }
}