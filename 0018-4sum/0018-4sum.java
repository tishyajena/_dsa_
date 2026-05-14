class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i<n-3; i++){
            for(int j = i+1; j<n-2; j++){
                long sum = nums[i] + nums[j];
                int left = j+1;
                int right = n-1;
                while(left<right){
                    long sum1 = nums[left] + nums[right] + sum;
                    if(sum1 == target){
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                    }
                    else if (sum1>target){
                        right--;
                    }
                    else{
                        left++;
                    }
                }
            }

        }
        return new ArrayList<>(res);
    }
}