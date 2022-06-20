package lesson3.sample;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MyArrayList<String> names = new MyArrayList<>();

        MyArrayList<Integer> nums = new MyArrayList<>();
        nums.add(55);


        names.add("Dean");
        names.add("Berhe");
        names.add(1,"Le");
        System.out.println( names);
        names.set(1,"Yasmeen");
        names.remove(2);


        System.out.println( names);
//        System.out.println("Old Value " +oldValue);

        System.out.println("===");
        System.out.println(names.size());





    }
}
