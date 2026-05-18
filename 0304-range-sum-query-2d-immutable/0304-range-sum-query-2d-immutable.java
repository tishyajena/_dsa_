class NumMatrix {
    int pr[][];
    public NumMatrix(int[][] matrix) {
        //creation of Prefix matrix
        int r = matrix.length;
        int c = matrix[0].length;

        pr = new int[r+1][c+1];

        for(int i = 1; i<= r; i++){
            for(int j = 1; j<=c; j++){
                //current element + top elements + left elements + overlapped element
                pr[i][j] = matrix[i-1][j-1]+pr[i-1][j]+pr[i][j-1]-pr[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        // because we are starting pr matrix from 1,1
        row1++;
        col1++; 
        row2++;
        col2++;
        // sum of whole matrix - sum of left elements - sum of top elements + overlapped element
        int sum = pr[row2][col2] - pr[row2][col1-1] -pr[row1-1][col2] + pr[row1-1][col1 -1 ];
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */