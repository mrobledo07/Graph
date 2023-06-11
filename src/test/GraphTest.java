package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.exceptions.ElementNotFound;
import main.exceptions.RepeatedElement;
import main.models.Graph;
import main.models.IGraph;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.text.html.parser.Element;

public class GraphTest {
    IGraph<Character> graph;

    @BeforeEach
    void setup() throws RepeatedElement, ElementNotFound{
        graph = new Graph<>();
        for (int i = 65; i < 91; i++){
            graph.addNode((char)i);
        }
    }

    @Test
    void testAddNode() throws ElementNotFound{
        for (int i = 65; i < 91; i++){
            assertTrue(graph.checkNode((char)i));
        }
    }

    @Test
    void testRemoveNode(){

    }

    @Test
    void testAddEdge(){

    }

    @Test
    void testRemoveEdge(){

    }

    @Test
    void testPrint(){

    }

    
}
