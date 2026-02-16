import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {

    // Performs BFS starting from node 0
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        // Stores BFS traversal
        ArrayList<Integer> bfs = new ArrayList<>();

        // Visited array
        // Space: O(V)
        boolean[] visited = new boolean[V];

        // Queue for BFS
        // Space: O(V) in worst case
        Queue<Integer> q = new LinkedList<>();

        // Start from node 0
        q.offer(0);
        visited[0] = true;

        // BFS traversal
        // Each vertex enters queue once → O(V)
        // Each edge checked once → O(E)
        // Total Time: O(V + E)

        while (!q.isEmpty()) {
            Integer node = q.poll();
            bfs.add(node);

            for (Integer num : adj.get(node)) {
                if (!visited[num]) {
                    visited[num] = true;
                    q.offer(num);
                }
            }
        }

        return bfs;
    }
}
