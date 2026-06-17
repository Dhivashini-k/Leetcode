class Solution {
    public int[] findOrder(int n, int[][] p) {
        //create a adj list and indegree Array
        int indegree[] = new int[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] edge : p){
            int a = edge[0] , b = edge[1];
            indegree[a]++;
            adj.get(b).add(a);
        }
        //find the topological sort 
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int [] ans = new int[n];
        int i=0;
        while(!q.isEmpty()){
            int node = q.poll();
            ans[i] = node;
            i++;
            //check the adjacdnt connestions 
            for(int a : adj.get(node)){
                indegree[a]--;
                if(indegree[a]==0){
                    q.offer(a);
                }
            }
        }
        return i==n?ans : new int[0];
    }
}