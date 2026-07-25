class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prodP = 1;
        int zeroC = 0;
        int index0 = 0;
        int [] res = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                zeroC++;
                index0 = i;
            }
            else{
                prodP*= nums[i];
            }
        }

        for(int i = 0; i<nums.length; i++){
            if(zeroC == 1){
                res[index0] = prodP;
            }
            else if(zeroC > 1){
                return res;
            }
            else{
                res[i] = prodP/nums[i];
            }
        }
        return res;
        
    }
}