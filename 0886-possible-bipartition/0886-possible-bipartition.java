class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        int adj_mat[][] = new int[n+1][n+1]; //n+1 because it is a 1 based index
        for(int i = 0; i<dislikes.length; i++){
            adj_mat[dislikes[i][0]][dislikes[i][1]] = 1;
            adj_mat[dislikes[i][1]][dislikes[i][0]] = 1; //because this is an undirected graph so the inverse is also possible
        }
        int color_grp[] = new int[n+1];
        //we generally use 1 and -1 for coloring in bipartition
        //1 -> group A
        //-1 -> group B


        for(int i = 1; i<=n; i++){
            if(color_grp[i] != 0){
                continue;
            }
            //we are doing bfs here
            Queue<Integer> q = new LinkedList<>();
            q.offer(i);

            color_grp[i] = 1;

            while(!q.isEmpty()){
                int current = q.poll();

                for(int j = 1; j<=n; j++){
                    if(adj_mat[current][j] == 1){
                        if(color_grp[j] == 0){
                            color_grp[j] = -color_grp[current];
                            q.offer(j); // we want to check the vice versa as well
                        }
                        else if(color_grp[j] == color_grp[current]){
                            return false;
                        }
                    }
                    
                }
            }
        }
        return true;
    }
}