public class Graph {
    private int maxN = 10;
    private int[][] arr;
    Vertex[] vertexList;
    private int currN;
    private MyStack stack = new MyStack();
    private MyQueue queue = new MyQueue();

    public Graph() {
        vertexList = new Vertex[maxN];
        arr = new int[maxN][maxN]; // adjacency matrix
        currN = 0;
    }

    public void addVertex(char name) {
        vertexList[currN++] = new Vertex(name);
    }

    public void addEdge(int start, int end, int val) {
        arr[start][end] = 1;
        arr[end][start] = val;
    }

    public int check(int v) {
        for (int i = 0; i < currN; i++) {
            if (arr[v][i] == 1 && vertexList[i].isVisited == false) {
                return i;
            }
        }

        return -1;
    }

    public void passInDepth(int index) {
        System.out.println(vertexList[index].name);
        vertexList[index].isVisited = true;
        stack.push(index);

        while (!stack.isEmpty()) {
            int neigh = check(stack.peek());


            if (neigh == -1) {
                neigh = stack.pop();
            }
            else  {
                System.out.println(vertexList[neigh].name);
                vertexList[neigh].isVisited = true;
                stack.push(neigh);
            }
        }

        for (int i = 0; i < currN; i++) {
            vertexList[i].isVisited = false;
        }
    }

    public void passInWidth(int index) {
        System.out.println(vertexList[index].name);
        vertexList[index].isVisited = true;
        queue.insert(index);

        int vertex;

        while(!queue.isEmpty()) {
            int temp = queue.remove();

            while((vertex = check(temp)) != -1 ) {
                System.out.println(vertexList[vertex].name);
                vertexList[vertex].isVisited = true;
                queue.insert(vertex);
            }
        }

        for (int i = 0; i < currN; i++) {
            vertexList[i].isVisited = false;
        }
    }
}
