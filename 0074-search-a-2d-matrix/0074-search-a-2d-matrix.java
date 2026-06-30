class Solution {
    static boolean searchElement(int[] a, int target){
        int low = 0;
        int high = a.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(a[mid] == target){
                return true;
            }
            else if(a[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        // for(int i = 0; i<matrix.length; i++){
        //     for(int j = 0; j<matrix[0].length; j++){
        //         if(matrix[i][j] == target) return true;
        //     }
        // }
        // return false;

        for(int i = 0; i<matrix.length; i++){
            if(searchElement(matrix[i], target)) return true;
        }
        return false;
    }
}