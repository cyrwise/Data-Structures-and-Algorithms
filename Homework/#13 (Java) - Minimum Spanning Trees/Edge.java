import java.util.*;

// Represents an edge in the graph
class Edge implements Comparable<Edge> {
    int src, dest, weight;

    // Compare edges based on their weights
    public int compareTo(Edge compareEdge) {
        return this.weight - compareEdge.weight;
    }
}

// Represents a graph
class Graph {
    int V, E; // Number of vertices and edges
    List<DirectedEdge> edges; // List of edges

    // Constructor to initialize the graph
    Graph(int v, int e) {
        V = v;
        E = e;
        edges = new ArrayList<>();
    }

    // Add an edge to the graph
    void addEdge(DirectedEdge edge) {
        edges.add(edge);
    }

    // Find operation for union-find
    int find(int[] parent, int i) {
        if (parent[i] == -1)
            return i;
        return find(parent, parent[i]);
    }

    // Union operation for union-find
    void Union(int[] parent, int x, int y) {
        int xset = find(parent, x);
        int yset = find(parent, y);
        parent[xset] = yset;
    }

    // Kruskal's algorithm to find Minimum Spanning Tree
    void KruskalMST() {
        List<DirectedEdge> result = new ArrayList<>();
        Collections.sort(edges); // Sort edges based on weight

        int[] parent = new int[V];
        Arrays.fill(parent, -1);

        int e = 0; // Index variable for result[]
        int i = 0; // Index variable for sorted edges
        while (e < V - 1 && i < E) { // Loop until V-1 edges are added or all edges are processed
            DirectedEdge next_edge = edges.get(i++);

            int x = find(parent, next_edge.from());
            int y = find(parent, next_edge.to());

            if (x != y) { // If including this edge does not create a cycle
                result.add(next_edge); // Add the edge to the result
                Union(parent, x, y); // Perform Union operation
                e++; // Increment result index
            }
        }

        // Print the edges in the constructed MST
        System.out.println("Edges in the constructed MST (with V=50 being a self reference):");
        int totalLength = 0;
        for (DirectedEdge edge : result) {
            System.out.println(edge.from() + " - " + edge.to() + ": " + edge.weight());
            totalLength += edge.weight();
        }
        System.out.println("Total length of cable used: " + totalLength); // Print total length of cable
    }
}
