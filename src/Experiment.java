public class Experiment {

    // Run BFS and DFS for one graph
    public void runTraversals(Graph g, int startVertex, boolean printTraversal) {

        long bfsStart = System.nanoTime();

        if (printTraversal) {
            g.bfs(startVertex);
        } else {
            g.bfs(startVertex);
        }

        long bfsEnd = System.nanoTime();

        long dfsStart = System.nanoTime();

        if (printTraversal) {
            g.dfs(startVertex);
        } else {
            g.dfs(startVertex);
        }

        long dfsEnd = System.nanoTime();

        System.out.println("BFS Execution Time: " + (bfsEnd - bfsStart) + " ns");
        System.out.println("DFS Execution Time: " + (dfsEnd - dfsStart) + " ns");

        System.out.println("-----------------------------------");
    }

    // Multiple tests
    public void runMultipleTests() {

        System.out.println("Running Graph Traversal Experiments...");
    }

    // Print results
    public void printResults() {

        System.out.println("Experiments completed.");
    }
}