class Solution {
    public int[] findErrorNums(int[] nums) {

        //-----APPROACH 1--------
        // int n = nums.length;
        // HashSet<Integer> set = new HashSet<>();
        // int [] res = new int[2];

        // for(int x: nums){
        //     if(set.contains(x)){
        //         res[0] = x;
        //     }
        //     set.add(x);
        // }

        // for(int i = 1; i<=n; i++){
        //     if(!set.contains(i)){
        //         res[1] = i;
        //     }
        // }
        // return res;

        //-----APPROACH 2--------
        int n = nums.length;
        boolean [] seen= new boolean[n+1];
        int duplicate = 0;
        int missing = 0;
        for(int x: nums){
            if(seen[x]){
                duplicate = x;
            }
            seen[x] = true;
        }
        for(int i = 1; i<=n; i++){
            if(!seen[i]){
                missing = i;
                break;
            }
        }
        return new int[] {duplicate, missing};
    }
}