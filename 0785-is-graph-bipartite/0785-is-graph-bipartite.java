class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int [] seen = new int[n];
        for(int i = 0; i<n; i++){
            if(seen[i] == 0){
                if(!dfs(graph, seen, i, 1)) return false;
            }
        }
        return true;
    }
    private boolean dfs(int [][] graph, int [] seen, int node, int color){
        seen[node] = color;
        for(int i: graph[node]){
            if(seen[i] == color) return false;
            else if(seen[i] == 0){
                if(!dfs(graph, seen, i, -color)) return false;
            }
        }
        return true;
    }
}