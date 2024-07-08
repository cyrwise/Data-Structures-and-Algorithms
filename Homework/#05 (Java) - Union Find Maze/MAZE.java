import java.util.ArrayList;
import java.util.Collections;

public class MAZE 
{
    private int height, width, size;
    private QuickUnionUF union_find;
    private ArrayList<Node> nodes = new ArrayList<>();
    private ArrayList<Connection> connections = new ArrayList<>();
    private ArrayList<Connection> possibleConnections = new ArrayList<>();


    private class Node 
    {
        public int id, x, y;
        private static int count;

        public Node() 
        {
            this.id = Node.count;
            Node.count++;
            this.x = id % width;
            this.y = id / width;
        }

        public String toString() 
        {
            return "(id=" + this.id + ", x=" + this.x + ", y=" + this.y + ")";
        }
    }

    private class Connection 
    {
        public Node node_1, node_2;

        public Connection(Node node_1, Node node_2) 
        {
            this.node_1 = node_1;
            this.node_2 = node_2;
        }

        public String toString() 
        {
            return "Connecting: Node 1 = " + this.node_1 + ", Node 2 = " + this.node_2;
        }
    }

    public static void main(String args[]) 
    {
        MAZE gen = new MAZE(15, 15);
        gen.generate();
    }

    public MAZE(int height, int width) 
    {
        this.height = height;
        this.width = width;
        this.size = width * height;

        this.createNodes();
        this.createConnections();
        this.union_find = new QuickUnionUF(this.size);
    }

    public void generate() 
    {
        this.randomizeConnections();
        for (int i = 0; i < this.possibleConnections.size(); i++) 
        {
            Connection c = this.possibleConnections.get(i);
            if (this.union_find.find(c.node_1.id) != this.union_find.find(c.node_2.id)) 
            {
                this.connections.add(c);
                this.union_find.union(c.node_1.id, c.node_2.id);
            }
        }

        for (Node n : this.nodes) 
        {
            System.out.println(n);
        }
        for (Connection c : this.connections) 
        {
            System.out.println(c);
        }
    }

    public void printMaze() 
    {
        for (int i = 0; i < this.size; i++) 
        {
            Node n = this.nodes.get(i);
            if (n.x != this.width-1) 
            {
                Node n2 = this.nodes.get(i+1);
                if (!isConnected(n, n2)) 
                {
                    System.out.print("-");
                }
            }
            if (n.y != this.height-1) {
                Node n2 = this.nodes.get(i+this.width);
                this.makeConnection(n, n2, this.possibleConnections);
            }
        }
    }

    private void createNodes() 
    {
        for (int i = 0; i < this.size; i++) 
        {
            this.nodes.add(new Node());
        }
    }

    private void createConnections() 
    {
        for (int i = 0; i < this.size; i++) 
        {
            Node n = this.nodes.get(i);
            if (n.x != this.width-1) 
            {
                Node n2 = this.nodes.get(i+1);
                this.makeConnection(n, n2, this.possibleConnections);
            }
            if (n.y != this.height-1) 
            {
                Node n2 = this.nodes.get(i+this.width);
                this.makeConnection(n, n2, this.possibleConnections);
            }
        }
    }

    private void makeConnection(Node n1, Node n2, ArrayList<Connection> cons) 
    {
        if (!this.isConnected(n1, n2, cons)) 
        {
            Connection c = new Connection(n1, n2);
            cons.add(c);
        }
    }


    private Boolean isConnected(Node n1, Node n2, ArrayList<Connection> cons) 
    {
        for (Connection c : cons) 
        {
            if (c.node_1 == n1 && c.node_2 == n2) 
            {
                return true;
            }
            if (c.node_1 == n2 && c.node_2 == n1) 
            {
                return true;
            }
        }
        return false;
    }

    private Boolean isConnected(Node n1, Node n2) 
    {
        return isConnected(n1, n2, this.connections);
    }

    private void randomizeConnections() 
    {
        Collections.shuffle(this.possibleConnections);
    }
}