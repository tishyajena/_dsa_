class Solution {
    public int[] productExceptSelf(int[] nums) {
        //----APPROACH 1-----
        // int n = nums.length;
        // int [] res = new int[n];
        // int prefix = 1;
        // int suffix = 1;

        // for(int i = 0; i<n; i++){
        //     res[i] = prefix;
        //     prefix*=nums[i];
        // }
        // for(int i = n-1; i>=0; i--){
        //     res[i]*=suffix;
        //     suffix*=nums[i];
        // }
        // return res;

        //------APPROACH 2------
        int n = nums.length;
        int [] res = new int[n];
        int cZero = 0;
        int totalP= 1;
        for(int x: nums){
            if(x == 0) cZero++;
            else{
                totalP*= x;
            }
        }
        
        for(int i = 0; i<n; i++){
            if(cZero>=2) return res;
            if(cZero == 1){
                if(nums[i] == 0) res[i] = totalP;
            }
            else{
                res[i] = totalP/nums[i];
            }
        }
        return res;
    }
}