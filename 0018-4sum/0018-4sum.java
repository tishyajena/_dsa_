class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < n - 3; i++) {
            for (int j =i+1; j < n - 2; j++) {
                long comp = (long)target - (nums[i] + nums[j]);
                int a = j + 1;
                int b = n-1;
                while (a < b) {
                    int sum = nums[a] + nums[b];

                    if (sum == comp) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[a], nums[b]));
                        a++;
                        b--;
                    } else if (sum > comp) {
                        b--;
                    } else {
                        a++;
                    }
                }
                

            }
        }

        return new ArrayList<>(result);
    }
}