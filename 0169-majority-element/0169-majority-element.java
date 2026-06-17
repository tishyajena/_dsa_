class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int x: nums){
        map.put(x, map.getOrDefault(x, 0)+1);
       }
       System.out.println(map);
       for(int x: nums){
        if(map.get(x)>nums.length/2){
            return x;
        }
       }
       return -1;
    }
}