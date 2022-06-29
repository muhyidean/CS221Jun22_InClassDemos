package lesson6;

import lesson4_5.SingleLinkedList;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = new LinkedList<>(Arrays.asList(2,6,5,4));

        Iterator<Integer> iter = nums.listIterator(2);

        Collections.sort(nums);

        System.out.println(nums);

//        Iterator<Integer> iterator = nums.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next()); //6
////                iterator.remove();
//        }



        System.out.println(nums);

        for(Integer i : nums){
            System.out.println(i);
        }
//
//        for (int i = 0; i < nums.size(); i++) {
//            System.out.println(nums.get(i));
//        }


        SingleLinkedList<Integer> myNums = new SingleLinkedList<>();
        myNums.add(2);
        myNums.add(5);
        myNums.add(6);



//
//        Iterator<Integer> iter = myNums.iterator();
//
//        System.out.println(iter.next());
    }
}
