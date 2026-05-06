class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int x: nums){
            if(!freq.containsKey(x)){
                freq.put(x,1);
            }
            else{
                freq.put(x,freq.get(x)+1);
            }
        }
        for(int x: nums){
            int max = freq.get(x);
            if (max>nums.length/2) return x;
        }
        return -1;
        
    }
}