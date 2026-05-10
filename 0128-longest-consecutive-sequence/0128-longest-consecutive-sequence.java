class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        
        HashSet<Integer> set = new HashSet<>();
        for(int x: nums){
            set.add(x);
        }
        
        int len = 0;
        for(int x: set){
            if(!set.contains(x-1))
            {
                int temp = x;
                int curr = 1;
                while(set.contains(temp+1)){
                    curr++;
                    temp++;
                }
                len = Math.max(curr, len);
            }
        }
        
        return len;
    }
}