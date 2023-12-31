public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex('1'); // 0
        graph.addVertex('2'); // 1
        graph.addVertex('3'); // 2
        graph.addVertex('4'); // 3
        graph.addVertex('5'); // 4
        graph.addVertex('6'); // 5
        graph.addVertex('7'); // 6
        //
        graph.addEdge(0, 1, 1);
        graph.addEdge(0, 2, 1);
        graph.addEdge(0, 6, 1);
        graph.addEdge(1, 3, 1);
        graph.addEdge(3, 4, 1);
        graph.addEdge(4, 5, 1);
        graph.addEdge(5, 6, 1);

        graph.passInWidth(0);

        /*graph.addVertex('8'); // 7

        graph.addEdge(0, 1, 1); // 1-2
        graph.addEdge(0, 3, 1); // 1-4
        graph.addEdge(1, 5, 1); // 2-6
        graph.addEdge(1, 6, 1); // 2-7
        graph.addEdge(3, 4, 1); // 4-5
        graph.addEdge(4, 7, 1); // 5-8
        graph.addEdge(5, 6, 1); // 6-7
        graph.addEdge(6, 2, 1); // 7-3*/
    }
}