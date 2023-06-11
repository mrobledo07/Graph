package main;

import main.models.*;

public class Main {
    public static void main(String[] args) throws Exception {
      IGraph<Character> graph = new Graph<>();

      graph.addNode('A');
      graph.addNode('B');
      graph.addNode('C');
      graph.addNode('D');

      graph.addEdge(0, 1);
      graph.addEdge(0, 2);
      graph.addEdge(1, 2);
      graph.addEdge(2, 3);
      graph.addEdge(2, 0);

      graph.print();

    }
}
