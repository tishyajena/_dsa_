class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>(); 
        for(int i = 0; i<nums.length; i++){
            if(freq.containsKey(nums[i])){
                freq.put(nums[i],freq.get(nums[i])+1);
            }
            else{
                freq.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> in: freq.entrySet()){
            if(in.getValue() > 1){
                res.add(in.getKey());
            }
        }
        return res;
    }
}