class Solution {
  public:
    // Function to return Breadth First Traversal of given graph.
    vector<int> bfsOfGraph(int V, vector<int> adj[]) {
        // Code here
        int vis[V] = {0};
        vis[0] = 1;
        queue<int> q;
        vector<int> bfs;
        q.push(0);
        while(!q.empty()){
            int node = q.front();
            q.pop();
            bfs.push_back(node);
            for(int it : adj[node]){
                if(!vis[it]){
                    vis[it] = 1;
                    q.push(it);
                }
            }
        }
        return bfs;
    }
};