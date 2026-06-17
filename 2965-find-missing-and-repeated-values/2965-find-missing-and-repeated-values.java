class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        // HashSet<Integer> set = new HashSet<>();
        // int m = grid.length;
        // int n = grid[0].length;

        // int [] res = new int[2];
        // for(int i = 0; i<m; i++){
        //     for(int j = 0; j<n; j++){
        //         if(set.contains(grid[i][j])){
        //             res[0] = grid[i][j];
        //         }
        //         set.add(grid[i][j]);
        //     }
        // }
        // for(int i = 1; i<=m*n; i++){
        //     if(!set.contains(i)){
        //         res[1] = i;
        //     }
        // }
        // return res;

        int m= grid.length;
        int n = grid[0].length;

        int [] arr = new int[(m*n)+1];

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                arr[grid[i][j]]++;
            }
        }

        int missing = -1;
        int repeated = -1;

        for(int i = 1; i<arr.length; i++){
            if(arr[i] == 0){
                missing = i;
            }
            else if(arr[i] == 2){
                repeated = i;
            }
        }

        return new int[] {repeated, missing};
    }
}