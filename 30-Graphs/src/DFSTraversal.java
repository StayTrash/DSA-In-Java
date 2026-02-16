import java.util.ArrayList;

public class DFSTraversal {
    public static void main(String[] args) {

    }

    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[adj.size()];
        ArrayList<Integer> res = new ArrayList<>();

        dfsRec(adj, visited, 0, res);

        return res;
    }

    static void dfsRec(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int s, ArrayList<Integer> res) {
        visited[s] = true;
        res.add(s);

        // Recursively visit all adjacent vertices
        // that are not visited yet
        for (int i : adj.get(s)) {
            if (!visited[i]) {
                dfsRec(adj, visited, i, res);
            }
        }
    }

//    Time complexity: O(V + E), where V is the number of vertices and E is the number of edges in the graph.
//    Auxiliary Space: O(V + E), since an extra visited array of size V is required, And stack size for recursive calls to dfsRec function.
}
