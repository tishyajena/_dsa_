class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int res = 0;
        int water;
        while(i<j){
            
            if(height[i]<height[j]){
                water = height[i]*(j-i);
                i++;
            }
            else{
                water = height[j]*(j-i);
                j--;
            }
            res = Math.max(water, res);

        }
        return res;
    }
}