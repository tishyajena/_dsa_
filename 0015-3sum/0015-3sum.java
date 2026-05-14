class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        
        for(int k = 0; k<nums.length-2; k++){
            ArrayList<Integer> a = new ArrayList<>();
            int i = k+1; 
            int j = nums.length-1;
            int target = -1*nums[k];
            while(i<j){
                int sum = nums[i]+nums[j];
                if(sum == target){
                    res.add(Arrays.asList(nums[k],nums[i],nums[j]));
                    i++;
                    j--;
                }
                else if(sum<target){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        return new ArrayList<>(res);
    }
}