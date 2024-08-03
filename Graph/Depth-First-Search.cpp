class Solution {
  public:
    void DFS(int node, vector<bool> &vis, vector<int> adj[], vector<int> &dfs){
        vis[node] = true;
        dfs.push_back(node);
        for(auto it : adj[node]){
            if(!vis[it]){
                DFS(it, vis, adj, dfs);
            }
        }
    }
    vector<int> dfsOfGraph(int V, vector<int> adj[]) {
        vector<bool> vis(V, false);
        int start = 0;
        vector<int> dfs;
        DFS(start, vis, adj, dfs);
        return dfs;
    }
};
