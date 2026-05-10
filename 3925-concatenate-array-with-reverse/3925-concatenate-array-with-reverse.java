class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int [] res = new int[n+n];
        int i = 0;
        int j = res.length-1;
        int k = 0;
        while(k<n && i<j){
            res[i] = nums[k];
            i++;
        
            res[j] = nums[k];
            j--;

            k++;
        }
        return res;
    }
}