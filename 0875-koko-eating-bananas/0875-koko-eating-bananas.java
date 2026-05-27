class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1; //minimum no of bananas koko can eat
        int right = 0;

        //finding the maximum no of bananas koko can eat
        for(int pile: piles){
            right = Math.max(right, pile);
        }

        int res = right;

        while(left<=right){
            int mid = left + (right-left)/2;
            if(canEatAll(piles, mid, h)){
                res = mid;
                right = mid-1;
            }
            else{
                left = mid + 1;
            }
        }
        return res;
    }
    private boolean canEatAll(int [] piles, int k, int h){
        long totalHours = 0;
        for(int pile: piles){
            totalHours+=(pile+k-1)/k;

            if(totalHours>h){
                return false;
            }
        }
        return totalHours <= h;
    }
}