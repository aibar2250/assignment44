public class Main {

    public static void main(String[] args) {

        Experiment experiment = new Experiment();

        // SMALL GRAPH (10 vertices)
        System.out.println("========== SMALL GRAPH (10) ==========");

        Graph smallGraph = createGraph(10);

        smallGraph.printGraph();

        experiment.runTraversals(smallGraph, 0, true);

        // MEDIUM GRAPH (30 vertices)
        System.out.println("========== MEDIUM GRAPH (30) ==========");

        Graph mediumGraph = createGraph(30);

        experiment.runTraversals(mediumGraph, 0, false);

        // LARGE GRAPH (100 vertices)
        System.out.println("========== LARGE GRAPH (100) ==========");

        Graph largeGraph = createGraph(100);

        experiment.runTraversals(largeGraph, 0, false);
    }

    // Method to create graphs
    public static Graph createGraph(int size) {

        Graph graph = new Graph();

        // Add vertices
        for (int i = 0; i < size; i++) {
            graph.addVertex(new Vertex(i));
        }

        // Add edges
        for (int i = 0; i < size - 1; i++) {

            graph.addEdge(i, i + 1);

            // Additional connections
            if (i + 2 < size) {
                graph.addEdge(i, i + 2);
            }
        }

        return graph;
    }
}