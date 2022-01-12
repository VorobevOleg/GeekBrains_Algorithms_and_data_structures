package lesson7;

public class Main {
    public static void main(String[] args) {
        testGraph();
//        testDfs();
//        testBfs();
    }

    private static void testGraph() {

        Graph graph = new GraphImpl(10);

        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");
        graph.addVertex("Липецк");
        graph.addVertex("Тамбов");
        graph.addVertex("Орел");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");
        graph.addVertex("Воронеж");

        graph.addEdge("Москва", "Тула", 10);
        graph.addEdge("Москва", "Рязань", 13);
        graph.addEdge("Москва", "Калуга", 15);
        graph.addEdge("Тула", "Липецк", 8);
        graph.addEdge("Рязань", "Тамбов", 20);
        graph.addEdge("Калуга", "Орел", 7);
        graph.addEdge("Липецк", "Воронеж", 3);
        graph.addEdge("Тамбов", "Саратов", 3);
        graph.addEdge("Орел", "Курск", 9);
        graph.addEdge("Саратов", "Воронеж", 11);
        graph.addEdge("Курск", "Воронеж", 6);
        graph.addEdge("Курск", "Саратов", 1);




        System.out.println("Size of graph is " + graph.getSize());
        graph.display();


        graph.displayAdjMatrix();
        graph.displayVisitMatrix();



        graph.dfs("Москва");
        graph.displayVisitMatrix();


    }

//    private static void testDfs() {
//        Graph graph = new GraphImpl(7);
//        graph.addVertex("A");
//        graph.addVertex("B");
//        graph.addVertex("C");
//        graph.addVertex("D");
//        graph.addVertex("E");
//        graph.addVertex("F");
//        graph.addVertex("G");
//
//        graph.addEdge("A", "B", "C", "D");
//        graph.addEdge("B", "E");
//        graph.addEdge("D", "F");
//        graph.addEdge("F", "G");
//
//        graph.dfs("A");
//    }
//
//    private static void testBfs() {
//        Graph graph = new GraphImpl(8);
//        graph.addVertex("A");
//        graph.addVertex("B");
//        graph.addVertex("C");
//        graph.addVertex("D");
//        graph.addVertex("E");
//        graph.addVertex("F");
//        graph.addVertex("G");
//        graph.addVertex("H");
//
//        graph.addEdge("A", "B", "C", "D");
//        graph.addEdge("B", "E");
//        graph.addEdge("E", "H");
//        graph.addEdge("C", "F");
//        graph.addEdge("D", "G");
//
//        graph.bfs("A");
//    }
}
