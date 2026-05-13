class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<numbers.length; i++){
            map.put(numbers[i],i);
        }
        for(int i = 0; i<numbers.length; i++){
            int com = target-numbers[i];
            if(map.containsKey(com)){
                ans[0] = i+1;
                ans[1] = map.get(com)+1;
                return ans;
            }
        }
        return ans;
    }
}