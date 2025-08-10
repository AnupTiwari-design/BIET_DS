package Graph;
import java.util.*;

public class GraphAdjList {

    // Add undirected edge
    public static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // Print adjacency list
    public static void print(List<List<Integer>> adj, int V) {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int node : adj.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 6;
        List<List<Integer>> adj = new ArrayList<>();

        // Initialize each adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 0, 3);
        addEdge(adj, 1, 5);
        addEdge(adj, 1, 4);
        addEdge(adj, 1, 3);
        addEdge(adj, 3, 4);

        // Print graph
        print(adj, V);
    }
}