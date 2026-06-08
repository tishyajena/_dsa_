class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;
        int i = 2;
    	int count = 0;
        for(int j = 2; j<nums.length; j++){
            if(nums[j] != nums[i-2]){
                nums[i] = nums[j];
                i++;
            }
            

        }
        return i;
        
    }
}