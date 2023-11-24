public class Graph {
    private int maxN = 10;
    private int[][] arr;
    Vertex[] vertexList;
    private int currN;

    public Graph() {
        vertexList = new Vertex[maxN];
        arr = new int[maxN][maxN];
        currN = 0;
    }

    public void addVertex(char name) {
        vertexList[currN++] = new Vertex(name);
    }

    public void addEdge(int start, int end, int val) {
        mas[start][end] = 1;
        mas[end][start] = val;
    }

    public int check(int v) {
        
    }
}
