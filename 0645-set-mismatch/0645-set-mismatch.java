class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int [] res = new int[2];

        for(int x: nums){
            if(set.contains(x)){
                res[0] = x;
            }
            set.add(x);
        }

        for(int i = 1; i<=n; i++){
            if(!set.contains(i)){
                res[1] = i;
            }
        }
        return res;
    }
}