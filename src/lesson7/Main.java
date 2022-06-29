package lesson7;

import lesson4_5.SingleLinkedList;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        MyStack<Integer> s = new SingleLinkedList<>();

        s.push(5);
        s.push(4);
        s.push(1);



        int si = s.size();
        for (int i = 0; i < si ; i++) {
            System.out.println(s.pop());
        }

    }
}
