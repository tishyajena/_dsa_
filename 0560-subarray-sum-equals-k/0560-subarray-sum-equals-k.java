class Solution {
    public int subarraySum(int[] nums, int k) {
        // -----------BRUTE FORCE--------------
        // int count = 0;
        // for(int i = 0; i<nums.length; i++){
        //     for(int j = i; j<nums.length;j++){
        //         int sum = 0;
        //         for(int z = i; z<=j; z++){
        //             sum+=nums[z];
                    
        //         }
        //         if(sum == k) count++;
        //     }
        // }
        // return count;

        // -----------OPTIMAL APPROACH--------------
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>(); // {sum, freq of sum}
        int sum = 0;
    
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            if(sum == k) count++;
            if(map.containsKey(sum-k)) count+=map.get(sum-k);
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}