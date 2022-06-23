package lesson4_5;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SingleLinkedList<String> names =new SingleLinkedList<>();

        names.add("A");
        names.add("B");
        names.add("D");
        names.add(2, "C");

        System.out.println(names);
        System.out.println(names.size());




    }
}
