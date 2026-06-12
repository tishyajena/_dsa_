class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //------BRUTE FORCE-----
        // int oldColor = image[sr][sc];
        // if(oldColor == color) return image;

        // int m = image.length;
        // int n = image[0].length;

        // image[sr][sc] = color;

        // boolean changed = true;

        // while(changed){
        //     changed = false;
        //     for(int i = 0; i<m; i++){
        //         for(int j = 0; j<n; j++){
        //             if(image[i][j] == oldColor){
        //                 if((i>0 && image[i-1][j] == color) || 
        //                    (i<m-1 && image[i+1][j] == color) || 
        //                    (j>0 && image[i][j-1] == color) || 
        //                    (j<n-1 && image[i][j+1] == color)){

        //                     image[i][j] = color;
        //                     changed = true;
        //                 }
        //             }
        //         }
        //     }
        // }

        // return image;

        //-----DFS-----
        int oldColor = image[sr][sc];
        if(oldColor == color) return image;
        dfs(image, sr, sc, oldColor, color);
        return image;
    }
    private void dfs(int[][] img, int sr, int sc, int oc, int color){
        int m = img.length;
        int n = img[0].length;

        if(sr<0 || sr>=m || sc<0 || sc>=n) return;
        if(img[sr][sc] != oc) return;

        img[sr][sc] = color;

        dfs(img, sr+1, sc, oc, color);
        dfs(img, sr-1, sc, oc, color);
        dfs(img, sr, sc+1, oc, color);
        dfs(img, sr, sc-1, oc, color);
    }

}