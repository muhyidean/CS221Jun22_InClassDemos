package lesson4_5;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SingleLinkedList<String> names =new SingleLinkedList<>();

        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");

        System.out.println(names);
        names.remove(0);
        System.out.println("Removed Zero " + names);
        names.remove(2);
        System.out.println("Removed 2 " + names);


        SingleLinkedList<Integer> nums = new SingleLinkedList<>();
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(1);
        nums.add(3);
//        nums.add(2);

        nums.removeAllItem(2);
        System.out.println( nums );






    }
}
