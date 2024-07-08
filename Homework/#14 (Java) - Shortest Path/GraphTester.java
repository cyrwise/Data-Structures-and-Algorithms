import java.util.ArrayList;

public class GraphTester 
{
    public static void main(String[] args) 
    {
        // Create a new directed graph with 51 vertices
        EdgeWeightedDigraph g = new EdgeWeightedDigraph(51);
        // Create a list to store new edges
        ArrayList<DirectedEdge> newEdges = new ArrayList<>();

        g.addEdge(new DirectedEdge(0, 1, 33));
        g.addEdge(new DirectedEdge(0, 2, 30));
        g.addEdge(new DirectedEdge(0, 6, 17));
        g.addEdge(new DirectedEdge(0, 9, 25));
        g.addEdge(new DirectedEdge(1, 4, 25));
        g.addEdge(new DirectedEdge(1, 5, 13));
        g.addEdge(new DirectedEdge(1, 6, 18));
        g.addEdge(new DirectedEdge(2, 3, 15));
        g.addEdge(new DirectedEdge(2, 9, 20));
        g.addEdge(new DirectedEdge(2, 10, 35));
        g.addEdge(new DirectedEdge(2, 12, 27));
        g.addEdge(new DirectedEdge(3, 8, 15));
        g.addEdge(new DirectedEdge(3, 9, 31));
        g.addEdge(new DirectedEdge(3, 12, 23));
        g.addEdge(new DirectedEdge(3, 14, 15));
        g.addEdge(new DirectedEdge(3, 21, 20));
        g.addEdge(new DirectedEdge(4, 5, 20));
        g.addEdge(new DirectedEdge(4, 7, 31));
        g.addEdge(new DirectedEdge(4, 16, 40));
        g.addEdge(new DirectedEdge(5, 6, 20));
        g.addEdge(new DirectedEdge(5, 7, 15));
        g.addEdge(new DirectedEdge(5, 8, 30));
        g.addEdge(new DirectedEdge(6, 8, 25));
        g.addEdge(new DirectedEdge(6, 9, 21));
        g.addEdge(new DirectedEdge(7, 50, 0)); // Field Station Node
        g.addEdge(new DirectedEdge(7, 8, 35));
        g.addEdge(new DirectedEdge(7, 16, 25));
        g.addEdge(new DirectedEdge(7, 17, 20));
        g.addEdge(new DirectedEdge(7, 32, 30));
        g.addEdge(new DirectedEdge(8, 9, 16));
        g.addEdge(new DirectedEdge(8, 21, 35));
        g.addEdge(new DirectedEdge(8, 32, 32));
        g.addEdge(new DirectedEdge(10, 12, 22));
        g.addEdge(new DirectedEdge(10, 13, 28));
        g.addEdge(new DirectedEdge(11, 43, 35));
        g.addEdge(new DirectedEdge(11, 45, 21));
        g.addEdge(new DirectedEdge(11, 47, 33));
        g.addEdge(new DirectedEdge(11, 48, 44));
        g.addEdge(new DirectedEdge(12, 14, 22));
        g.addEdge(new DirectedEdge(12, 15, 30));
        g.addEdge(new DirectedEdge(13, 15, 28));
        g.addEdge(new DirectedEdge(14, 50, 0)); // Field Station Node
        g.addEdge(new DirectedEdge(14, 15, 36));
        g.addEdge(new DirectedEdge(14, 19, 23));
        g.addEdge(new DirectedEdge(14, 20, 35));
        g.addEdge(new DirectedEdge(14, 21, 16));
        g.addEdge(new DirectedEdge(15, 20, 25));
        g.addEdge(new DirectedEdge(16, 17, 30));
        g.addEdge(new DirectedEdge(16, 22, 35));
        g.addEdge(new DirectedEdge(16, 27, 50));
        g.addEdge(new DirectedEdge(17, 22, 28));
        g.addEdge(new DirectedEdge(17, 23, 25));
        g.addEdge(new DirectedEdge(17, 28, 38));
        g.addEdge(new DirectedEdge(17, 32, 15));
        g.addEdge(new DirectedEdge(18, 21, 20));
        g.addEdge(new DirectedEdge(18, 23, 30));
        g.addEdge(new DirectedEdge(18, 24, 30));
        g.addEdge(new DirectedEdge(18, 29, 40));
        g.addEdge(new DirectedEdge(18, 32, 15));
        g.addEdge(new DirectedEdge(19, 20, 30));
        g.addEdge(new DirectedEdge(19, 21, 30));
        g.addEdge(new DirectedEdge(19, 24, 35));
        g.addEdge(new DirectedEdge(19, 25, 25));
        g.addEdge(new DirectedEdge(19, 26, 40));
        g.addEdge(new DirectedEdge(20, 26, 30));
        g.addEdge(new DirectedEdge(21, 24, 45));
        g.addEdge(new DirectedEdge(21, 32, 26));
        g.addEdge(new DirectedEdge(22, 27, 35));
        g.addEdge(new DirectedEdge(22, 28, 30));
        g.addEdge(new DirectedEdge(23, 28, 18));
        g.addEdge(new DirectedEdge(23, 29, 32));
        g.addEdge(new DirectedEdge(23, 32, 30));
        g.addEdge(new DirectedEdge(24, 25, 25));
        g.addEdge(new DirectedEdge(24, 29, 15));
        g.addEdge(new DirectedEdge(25, 50, 0)); // Field Station Node
        g.addEdge(new DirectedEdge(25, 26, 30));
        g.addEdge(new DirectedEdge(25, 30, 30));
        g.addEdge(new DirectedEdge(25, 31, 21));
        g.addEdge(new DirectedEdge(25, 37, 50));
        g.addEdge(new DirectedEdge(26, 31, 20));
        g.addEdge(new DirectedEdge(26, 38, 55));
        g.addEdge(new DirectedEdge(27, 28, 43));
        g.addEdge(new DirectedEdge(27, 34, 25));
        g.addEdge(new DirectedEdge(27, 42, 26));
        g.addEdge(new DirectedEdge(28, 50, 0)); // Field Station Node
        g.addEdge(new DirectedEdge(28, 29, 42));
        g.addEdge(new DirectedEdge(28, 34, 33));
        g.addEdge(new DirectedEdge(28, 35, 25));
        g.addEdge(new DirectedEdge(29, 30, 35));
        g.addEdge(new DirectedEdge(29, 35, 30));
        g.addEdge(new DirectedEdge(29, 36, 37));
        g.addEdge(new DirectedEdge(30, 36, 33));
        g.addEdge(new DirectedEdge(30, 37, 30));
        g.addEdge(new DirectedEdge(31, 37, 35));
        g.addEdge(new DirectedEdge(31, 38, 40));
        g.addEdge(new DirectedEdge(33, 37, 35));
        g.addEdge(new DirectedEdge(33, 38, 25));
        g.addEdge(new DirectedEdge(33, 39, 25));
        g.addEdge(new DirectedEdge(33, 46, 30));
        g.addEdge(new DirectedEdge(33, 49, 20));
        g.addEdge(new DirectedEdge(34, 35, 33));
        g.addEdge(new DirectedEdge(34, 41, 25));
        g.addEdge(new DirectedEdge(34, 42, 20));
        g.addEdge(new DirectedEdge(34, 43, 37));
        g.addEdge(new DirectedEdge(35, 36, 43));
        g.addEdge(new DirectedEdge(35, 40, 35));
        g.addEdge(new DirectedEdge(35, 41, 30));
        g.addEdge(new DirectedEdge(36, 37, 28));
        g.addEdge(new DirectedEdge(36, 39, 25));
        g.addEdge(new DirectedEdge(36, 40, 30));
        g.addEdge(new DirectedEdge(37, 38, 25));
        g.addEdge(new DirectedEdge(37, 39, 30));
        g.addEdge(new DirectedEdge(39, 40, 40));
        g.addEdge(new DirectedEdge(39, 46, 20));
        g.addEdge(new DirectedEdge(40, 50, 0)); // Field Station Node
        g.addEdge(new DirectedEdge(40, 41, 27));
        g.addEdge(new DirectedEdge(40, 45, 20));
        g.addEdge(new DirectedEdge(40, 46, 28));
        g.addEdge(new DirectedEdge(41, 43, 14));
        g.addEdge(new DirectedEdge(41, 45, 23));
        g.addEdge(new DirectedEdge(42, 43, 34));
        g.addEdge(new DirectedEdge(42, 44, 24));
        g.addEdge(new DirectedEdge(42, 47, 36));
        g.addEdge(new DirectedEdge(43, 45, 30));
        g.addEdge(new DirectedEdge(43, 47, 15));
        g.addEdge(new DirectedEdge(44, 47, 26));
        g.addEdge(new DirectedEdge(45, 46, 30));
        g.addEdge(new DirectedEdge(45, 48, 33));
        g.addEdge(new DirectedEdge(46, 48, 15));
        g.addEdge(new DirectedEdge(46, 49, 35));
        g.addEdge(new DirectedEdge(48, 49, 32));

        // Add edges with swapped vertices to the list, needed for bidrectional functionality
        for (DirectedEdge edge : g.edges()) 
        {
            DirectedEdge swappedEdge = new DirectedEdge(edge.to(), edge.from(), edge.weight());
            newEdges.add(swappedEdge);
        }

        // Add these new edges to g
        for (DirectedEdge edge : newEdges) 
        {
            g.addEdge(edge);
        }

        DijkstraSP dijkstra = new DijkstraSP(g, 50);
        printShortestPaths(dijkstra);
    }

    // -------------------------------------------- // 
            // printShortestPaths
            // (where stuff goes down!!!)
    // -------------------------------------------- // 

    // Method to print the shortest paths to all nodes
    private static void printShortestPaths(DijkstraSP dijkstra) 
    {
        // Loop through all nodes
        for (int i = 0; i < 50; i++) 
        {
            // Get the shortest path to node i
            Iterable<DirectedEdge> path = dijkstra.pathTo(i);
            // If a path exists
            if (path != null) 
            {
                // Calculate the total distance of the path
                double totalDistance = calculateTotalDistance(path);
                // If the total distance is not 0
                if (totalDistance != 0.0) 
                {
                    // Print the header for the node
                    System.out.println("=====================================");
                    System.out.println("Shortest path to node " + i + ":");
                    System.out.println("Total Distance: " + totalDistance);
                    System.out.println("Path:");
                    // Print each edge in the path
                    for (DirectedEdge edge : path) 
                    {
                        if (edge.weight() != 0.0) 
                        {
                            System.out.println("From Node " + edge.from() + " to Node " + edge.to() + ", Distance: " + edge.weight());
                        }
                    }
                    // Print the footer for the node
                    System.out.println("=====================================");
                } 
                else 
                {
                    // Print a message if no path is found
                    System.out.println("No path found to node " + i);
                }
            }
        }
    }

    // -------------------------------------------- // 
            // calculateTotalDistance
            // (where stuff also goes down!!!)
    // -------------------------------------------- // 

    // Method to calculate the total distance of a path
    private static double calculateTotalDistance(Iterable<DirectedEdge> path) {
        double totalDistance = 0;
        // Loop through each edge in the path and sum the weights
        for (DirectedEdge edge : path) {
            totalDistance += edge.weight();
        }
        return totalDistance;
    }
}