class Solution {
    public int subarraySum(int[] nums, int k) {
    
    //----Brute force----
    //     int n = nums.length;
    //     int count = 0;
    //     for(int i = 0; i<n; i++){
    //         int sum = 0;
    //         for(int j = i; j<n; j++){
    //             sum+=nums[j];
    //         }
    //         if(sum == k) count++;

    //     }
    //     return count;

    //----Optimal force----
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int total = 0;
        int count = 0;

        for(int x: nums){
            total += x;

            if(map.containsKey(total-k)){
                count+= map.get(total-k);
            }

            map.put(total, map.getOrDefault(total, 0) +1);
        }

        return count;

    }

}