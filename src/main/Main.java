package main;

import main.models.ArrayList;
import main.models.IList;
import main.models.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
       IList<Character> array = new ArrayList<>();
       IList<Character> linkedList = new LinkedList<>();

       for(int i = 65; i < 91; i++){
            array.add((char)i);
            linkedList.add((char)i);
       }

       for (int i = 0; i < 25; i++){
            System.out.print(array.get(i) + " , ");
       }
       System.out.println();

       for (int i = 0; i < 25; i++){
            System.out.print(linkedList.get(i) + " -> ");
       }

     //   for (int i = 0; i < 25; i++){
     //        System.out.print(array.contains((char)i) + " , ");
     //   }

     //    System.out.println();


     //   for (int i = 0; i < 25; i++){
     //        System.out.print(linkedList.contains((char)i) + " -> ");
     //   }

    }
}
