class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        
        int [] b = new int[k];
        int [] a = new int[n-k];

        for(int i = 0; i<n-k; i++){
            a[i] = nums[i];
        }
        
        int j = 0;
        for(int i = n-k; i<n; i++){
            b[j] = nums[i];
            j++;
        }
        
        j = 0;
        for(int i = 0; i<n; i++){
            if(i<k){
                nums[i] = b[i];
            }
            else{
                nums[i] = a[j];
                j++;
            }
        }
        
        
        
    }
}