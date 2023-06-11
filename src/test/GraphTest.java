package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.exceptions.ElementNotFound;
import main.exceptions.RepeatedElement;
import main.models.Graph;
import main.models.IGraph;

import static org.junit.jupiter.api.Assertions.*;


public class GraphTest {
    IGraph<Character> graph;

    @BeforeEach
    void setup() throws RepeatedElement, ElementNotFound{
        graph = new Graph<>();
        for (int i = 65; i < 91; i++)
            graph.addNode((char)i);
        

        for (int i = 0; i < 25; i++){
            int j = i + 1;
            graph.addEdge(i, j);
        }
        
    }
    

    @Test
    void testAddNode() throws ElementNotFound{
        for (int i = 65; i < 91; i++){
            assertTrue(graph.checkNode((char)i));
        }
    }

    @Test
    void testRemoveNode() throws ElementNotFound{
         for (int i = 65; i < 70; i++){
            graph.removeNode((char)i);
        }

        for (int i = 65; i < 70; i++){
            assertFalse(graph.checkNode((char)i));
        }
    }

    @Test
    void testAddEdge() throws ElementNotFound, RepeatedElement{
        for (int i = 0; i < 25; i++){
            int j = i + 1;
            assertTrue(graph.checkEdge(i, j));
        }
    }

    @Test
    void testRemoveEdge() throws ElementNotFound{
        for (int i = 0; i < 25; i++){
            int j = i + 1;
            graph.removeEdge(i, j);
        }

        for (int i = 0; i < 25; i++){
            int j = i + 1;
            assertFalse(graph.checkEdge(i, j));
        }

    }

    @Test
    void testPrint(){
        graph.print();
    }

    
}
