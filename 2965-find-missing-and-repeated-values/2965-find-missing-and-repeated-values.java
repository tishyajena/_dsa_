class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();
        int m = grid.length;
        int n = grid[0].length;

        int [] res = new int[2];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(set.contains(grid[i][j])){
                    res[0] = grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }
        for(int i = 1; i<=m*n; i++){
            if(!set.contains(i)){
                res[1] = i;
            }
        }
        return res;
    }
}