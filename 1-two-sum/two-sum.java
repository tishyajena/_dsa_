class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] a = new int[2];
        Map<Integer,Integer> num = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            num.put(nums[i],i);
        }
        for(int i = 0; i<nums.length; i++){
            int c = target - nums[i];
            if(num.containsKey(c) && num.get(c)!=i){
                a[0] = i;
                a[1] = num.get(c);
                return a;
            }
        }
        return a;
        
    }
}