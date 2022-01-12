package lesson7;

public interface Graph {

    void addVertex(String label);

    boolean addEdge(String startLabel, String secondLabel, String... others);
    boolean addEdge(String startLabel, String secondLabel);
    boolean addEdge(String startLabel, String secondLabel, int weight);

    int getSize();

    void display();

    void displayAdjMatrix();

    void displayVisitMatrix();

    /**
     * англ. Depth-first search, DFS
     */
    void dfs(String startLabel);

    /**
     * англ. breadth-first search, BFS
     */
    void bfs(String startLabel);

}
