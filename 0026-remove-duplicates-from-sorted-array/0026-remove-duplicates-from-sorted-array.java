class Solution {
    public int removeDuplicates(int[] nums) {
    //    int count = 0;
    //    //if(nums.isEmpty()) return;

    //    int i = 0;
    //    int j = 1;
    //    int k = j+1;
    //    while(j<nums.length){
    //     if(nums[i] == nums[j]){
    //         j++;
    //         i++;
    //     }
    //     else{
    //         nums[i] = nums[j];
    //         j++;
    //         count++;
    //     }
    //    }
       
        int count = 0;
       HashSet<Integer> set = new HashSet<>();
       int i = 0;
       for(int x: nums){
        if(!set.contains(x)){
            set.add(x);
            nums[i++] = x;
            count++;
        }
        
       }
       
       return count;
    }
}