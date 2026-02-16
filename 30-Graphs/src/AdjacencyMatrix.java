import java.util.Arrays;
import java.util.Scanner;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // number of nodes (V)
        int n = in.nextInt();

        // number of edges (E)
        int m = in.nextInt();

        // Adjacency Matrix
        // Space Complexity: O(V^2)
        int[][] adj = new int[n + 1][n + 1];

        // Building graph
        // Time Complexity: O(E)
        for (int i = 0; i < m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();

            adj[u][v] = 1;   // O(1)

            // For undirected graph also mark reverse edge
            adj[v][u] = 1;   // O(1)
        }

        // Printing matrix
        // Time Complexity: O(V^2)
        System.out.println(Arrays.deepToString(adj));


        // Space Complexity: O(V^2)
        // Graph Construction Time: O(E)
        // Traversal / Printing Time: O(V^2)

        in.close();
    }
}
