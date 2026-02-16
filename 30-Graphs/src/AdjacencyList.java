import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyList {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = in.nextInt();   // V vertices

        System.out.print("Enter number of edges: ");
        int m = in.nextInt();   // E edges

        System.out.print("Enter 1 for Directed graph, 0 for Undirected graph: ");
        int type = in.nextInt();

        // Adjacency List
        // Space Complexity: O(V + E)
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // O(V)
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter edges (u v):");

        // Building Graph
        // Time Complexity: O(E)
        for (int i = 0; i < m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();

            adj.get(u).add(v);  // O(1) amortized

            // For undirected graph store reverse edge also
            if (type == 0) {
                adj.get(v).add(u);  // O(1)
            }
        }

        // Printing Adjacency List
        // Time Complexity: O(V + E)
        System.out.println("\nAdjacency List:");

        for (int i = 1; i <= n; i++) {          // O(V)
            System.out.print(i + " -> ");

            for (int neighbor : adj.get(i)) {   // total iterations across all lists = E (or 2E)
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }

        // Space Complexity: O(V + E)
        // Graph Construction Time: O(E)
        // Traversal / Printing Time: O(V + E)

        in.close();
    }
}
