class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();

        for(int k =0; k<nums.length-2; k++){
            int i = k+1;
            int j = nums.length-1;
            int comp = nums[k]*-1;
            while(i<j){
                if(nums[i]+nums[j]<comp){
                    i++;
                }
                else if (nums[i]+nums[j] > comp){
                    j--;
                }
                else{
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    
                    i++;
                    j--;
                }

            }
        }
        return new ArrayList<> (res);

    }
}