package lesson8;

import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        MyQueue<Integer> nums = new CircularArrayQueue<>();

        nums.offer(2);
        nums.offer(3);
        nums.offer(4);

        // [2 ,3 ,4 ]
        System.out.println(nums.poll()); // 2
        System.out.println(nums.peek()); // 3
        System.out.println(nums.poll()); // 3
        System.out.println(nums.peek()); // 4

    }
}
