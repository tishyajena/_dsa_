class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int i = 0;
        int j = height.length-1;
        while(i<j){
            if(height[i]>=height[j]){
                int len = j-i;
                res = Math.max(len*height[j], res);
                j--;
            }
            else{
                int len = j-i;
                res = Math.max(len*height[i], res);
                i++;
            }

        }
        return res;
    }
}