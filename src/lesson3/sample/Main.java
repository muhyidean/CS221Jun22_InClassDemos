package lesson3.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {

        MyArrayList<Integer> nums = new MyArrayList<>();
        nums.add(4);
        nums.add(4);
        nums.add(4);
        nums.add(4);
        nums.add(4);


        nums.removeAllOf(4);
        System.out.println(nums.size());







    }
}
