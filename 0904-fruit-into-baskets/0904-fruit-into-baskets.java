class Solution {
    public int totalFruit(int[] fruits) {
        int maxLen = 0;
        int l = 0;
        HashMap<Integer, Integer> count = new HashMap<>();

        for(int r = 0; r<fruits.length; r++){
            count.put(fruits[r],count.getOrDefault(fruits[r],0)+1);

            while(count.size()>2){
                
                count.put(fruits[l], count.get(fruits[l])-1); // decrease the freq of the fruit
                count.remove(fruits[l],0); // remove fruit if 0
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
        }
    
        return maxLen;
    }
}