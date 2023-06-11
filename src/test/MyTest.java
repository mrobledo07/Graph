package test;

import main.exceptions.ElementNotFound;
import main.models.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MyTest {
    
    IList<Character> array;
    IList<Character> linkedList;

    @BeforeEach
    void setUp() {
        array = new ArrayList<>();
        linkedList = new LinkedList<>();
    }

    @Test
    void testAddLinkedList() {
        for(int i = 65; i < 91; i++){
            linkedList.add((char)i);
        }

        for(int i = 0; i < 26; i++){
            assertTrue(linkedList.contains((char)(i+65)));
        }
    }

    @Test
    void testAddArrayList() {
        for(int i = 65; i < 91; i++){
            array.add((char)i);
        }

        for(int i = 0; i < 26; i++){
            assertTrue(array.contains((char)(i+65)));
        }
    }

    @Test
    void testRemoveLinkedList() throws ElementNotFound {
        for(int i = 65; i < 91; i++){
            linkedList.add((char)i);
        }

        for(int i = 65; i < 70; i++){
            linkedList.remove((char)i);
        }

        for(int i = 0; i < 5; i++){
            assertFalse(linkedList.contains((char)(i+65)));
        }
    }

    @Test
    void testRemoveArrayList() throws ElementNotFound{
        for(int i = 65; i < 91; i++){
            array.add((char)i);
        }

        for(int i = 65; i < 70; i++){
            array.remove((char)i);
        }

        for(int i = 0; i < 5; i++){
            assertFalse(array.contains((char)(i+65)));
        }
    }


}
