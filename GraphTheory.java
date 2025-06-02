import java.util.Scanner;
public class GraphTheory{
    private int vertices;
    private int edges;
    private int[] degrees;
    
    public GraphTheory() {
        vertices = vertex();
        edges = edge();
        degrees = new int[edges];
        for (int i = 0; i < degrees.length; i++) {
            System.out.println("What is vertex " + (i + 1) + "'s degree (amount of edges that traverse the vertex)?");
            degrees[i] = degree();
        }
    }

    public GraphTheory(int v, int e, int[] d) {
        vertices = v;
        edges = e;
        degrees = d;
    }

    
    public int vertex() {
        Scanner s = new Scanner(System.in);
        System.out.print("How many vertices are there? ");
        return s.nextInt();
    }

    public int edge() {
        Scanner s = new Scanner(System.in);
        System.out.print("How many edges are there? ");
        return s.nextInt();
    }
    
    public int degree() {
        Scanner s = new Scanner(System.in);
        System.out.print("Degree: ");
        return s.nextInt();
    }

    public boolean isGraph() {
        int sum = 0;
        for (int x : degrees) {
            sum += x;
        }
        return sum == (edges * 2);
    }
    
    // See whether the graph made is an Eulerian Circuit, an Euclidian Path, or not at all
    public String euclidian() {
        int numOddDegrees = 0;
        for (int i = 0; i < degrees.length; i++) {
            if (degrees[i] % 2 == 1) numOddDegrees++;
        }
        if (numOddDegrees == 0) return "The graph is an Euclidian Circuit";
        else if (numOddDegrees <= 2) return "The graph is an Euclidian Path";
        return "The graph isn't an Euclidian Circuit, nor a Euclidian Path.";
    }
}