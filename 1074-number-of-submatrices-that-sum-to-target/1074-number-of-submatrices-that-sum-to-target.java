class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int count = 0;

        for(int top = 0; top<m; top++){
            int [] colSum = new int[n];
            for(int bottom = top; bottom<m; bottom++){

                //creation of 1D array (basically compressing it)
                for(int c = 0; c<n; c++){
                    colSum[c] += matrix[bottom][c];
                }
                
                //for subarrays
                for(int c1 = 0; c1<n; c1++){
                    int sum = 0;
                    for(int c2 = c1; c2<n; c2++){
                        sum+=colSum[c2];

                        if(sum == target) count++;
                    }
                }
            }
        }
        return count;
    }
}