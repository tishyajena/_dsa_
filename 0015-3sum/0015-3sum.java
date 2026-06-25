class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();

        for(int i = 0; i<n; i++){
            List<Integer> temp = new ArrayList<>();
            int comp = (nums[i])*-1;
            int a = i+1;
            int b = n-1;
            while(a<b){
                if(nums[a]+nums[b] == comp){
                    res.add(Arrays.asList(nums[a], nums[b], nums[i]));
                    a++;
                    b--;
                }
                else if (nums[a]+nums[b] > comp){
                    b--;
                }
                else{
                    a++;
                }
            }
        }
        return new ArrayList<>(res);
    }
}