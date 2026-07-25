class Solution {
    public void setZeroes(int[][] matrix) {
        //-----BRUTE FORCE-----
        // int r = matrix.length;
        // int c = matrix[0].length;
        
        // int mat2 [][] = new int[r][c];

        // //copy all the element of mat1 to mat2

        // for(int i = 0; i<r; i++){
        //     for(int j = 0; j<c; j++){
        //         mat2[i][j] = matrix[i][j];
        //     }
        // }

        // //set all the rows and columns where 0 is found to 0 in mat2

        // for(int i = 0; i<r; i++){
        //     for(int j = 0; j<c; j++){
        //         if(matrix[i][j] == 0){
        //             //set col as 0s
        //             for(int k = 0; k<c; k++){
        //                 mat2[i][k] = 0;
        //             }

        //             //set row as 0s
        //             for(int k = 0; k<r; k++){
        //                 mat2[k][j] = 0;
        //             }

        //         }
        //     }
        // }

        // //copy all the elements of mat2 to mat1

        // for(int i = 0; i<r; i++){
        //     for(int j = 0; j<c; j++){
        //         matrix[i][j] = mat2[i][j];
        //     }
        // }

        //-----OPTIMAL SOLUTION-----
        int r = matrix.length;
        int c = matrix[0].length;

        int [] ArrayRow = new int[r];
        int [] ArrayCol = new int[c];

        Arrays.fill(ArrayRow, 1);
        Arrays.fill(ArrayCol, 1);

        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(matrix[i][j] == 0){
                    ArrayRow[i] = 0;
                    ArrayCol[j] = 0;
                }
            }
        }

        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(ArrayRow[i] == 0 || ArrayCol[j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}