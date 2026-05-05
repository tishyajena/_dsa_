class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int a = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] == 0){
                count++;
            }
            else{
                nums[a] = nums[i];
                a++;
            }
        }
        for(int i = a; i<n; i++){
            nums[a] = 0;
            a++;
        }
        
    }
}