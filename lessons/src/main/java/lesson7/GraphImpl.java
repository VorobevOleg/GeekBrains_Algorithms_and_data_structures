package lesson7;

import java.util.*;

public class GraphImpl implements Graph{
    private final List<Vertex> vertexList;
    private final int[][] adjMatrix;
    private final boolean[][] visitMatrix;

    public GraphImpl(int maxVertexCount) {
        this.vertexList = new ArrayList<>(maxVertexCount);
        this.adjMatrix = new int[maxVertexCount][maxVertexCount];
        this.visitMatrix = new boolean[maxVertexCount][maxVertexCount];
    }

    public void displayAdjMatrix() {
        System.out.println();
        for (int i = 0; i < getSize(); i++) {
            for (int j = 0; j < getSize(); j++) {
                System.out.print(adjMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void displayVisitMatrix() {
        System.out.println();
        for (int i = 0; i < getSize(); i++) {
            for (int j = 0; j < getSize(); j++) {
                System.out.print(visitMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public boolean isVisited(int startIndex, int endIndex)
    {
        return visitMatrix[startIndex][endIndex];
    }

    @Override
    public void addVertex(String label) {
        vertexList.add(new Vertex(label));
    }

    @Override
    public boolean addEdge(String startLabel, String secondLabel) {
        int startIndex = indexOf(startLabel);
        int endIndex = indexOf(secondLabel);

        if (startIndex == -1 || endIndex == -1) {
            return false;
        }

        adjMatrix[startIndex][endIndex] = 1;
        return false;
    }

    @Override
    public boolean addEdge(String startLabel, String secondLabel, int weight) {
        int startIndex = indexOf(startLabel);
        int endIndex = indexOf(secondLabel);

        if (startIndex == -1 || endIndex == -1) {
            return false;
        }

        adjMatrix[startIndex][endIndex] = weight;
        return false;
    }

    private int indexOf(String label) {
        for (int i = 0; i < vertexList.size(); i++) {
            if (vertexList.get(i).getLabel().equals(label)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean addEdge(String startLabel, String secondLabel, String... others) {
        boolean result = addEdge(startLabel, secondLabel);

        for (String other : others) {
            result &= addEdge(startLabel, other);
        }

        return result;
    }


    @Override
    public int getSize() {
        return vertexList.size();
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < getSize(); i++) {
            sb.append(vertexList.get(i));
            for (int j = 0; j < getSize(); j++) {
                if (adjMatrix[i][j] > 0) {
                    sb.append(" -- ").append(adjMatrix[i][j]).append(" --> ").append(vertexList.get(j));
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public void dfs(String startLabel) {
        int startIndex = indexOf(startLabel);
        Vertex tempVertex;
        if (startIndex == -1) {
            throw new IllegalArgumentException("Неверная вершина: " + startLabel);
        }

        Stack<Vertex> stack = new Stack<>();
        resetVertexVisited();
        Vertex vertex = vertexList.get(startIndex);

        visitVertex(stack, vertex, vertex);
        while (!stack.isEmpty()) {
            tempVertex = stack.peek();
            vertex = getNearUnvisitedVertex(stack.peek());
            if (vertex != null) {
                visitVertex(stack,tempVertex, vertex);
                displayVisitMatrix();
            } else {
                stack.pop();
            }

        }
        System.out.println();
        
    }

    private Vertex getNearUnvisitedVertex(Vertex vertex) {
        int currentIndex = vertexList.indexOf(vertex);
        for (int i = 0; i < getSize(); i++) {
            if ((adjMatrix[currentIndex][i] > 0) && (!isVisited(indexOf(vertex.getLabel()), i))) {
                return vertexList.get(i);
            }
        }
        return null;
    }

    private void visitVertex(Stack<Vertex> stack, Vertex vertexPrevios, Vertex vertex) {
        System.out.print(vertex.getLabel() + " ");
        stack.add(vertex);
        visitMatrix[indexOf(vertexPrevios.getLabel())][indexOf(vertex.getLabel())] = true;
    }

    private void visitVertex(Queue<Vertex> queue, Vertex vertexPrevios, Vertex vertex) {
        System.out.print(vertex.getLabel() + " ");
        queue.add(vertex);
       visitMatrix[indexOf(vertexPrevios.getLabel())][indexOf(vertex.getLabel())] = true;
    }

    private void resetVertexVisited() {
        for (int i = 0; i < getSize(); i++ ) {
            for (int j = 0; j < getSize(); j++) {
                visitMatrix[i][j] = false;
            }
        }
    }

    @Override
    public void bfs(String startLabel) {
        int startIndex = indexOf(startLabel);
        Vertex tempVertex;
        if (startIndex == -1) {
            throw new IllegalArgumentException("Неверная вершина: " + startLabel);
        }

        Queue<Vertex> queue = new LinkedList<>();
        resetVertexVisited();
        Vertex vertex = vertexList.get(startIndex);

        visitVertex(queue, vertex, vertex);
        while (!queue.isEmpty()) {
            tempVertex = queue.peek();;
            vertex = getNearUnvisitedVertex(queue.peek());
            if (vertex != null) {
                visitVertex(queue, tempVertex, vertex);
            } else {
                queue.remove();
            }
        }
        System.out.println();
    }
}
