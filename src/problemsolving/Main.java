package problemsolving;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8));

        List<String> names = new ArrayList<>(Arrays.asList("John", "Dean"));

        Iterator<String> iterator = names.iterator();

        System.out.println(iterator.hasNext());

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toLowerCase());
        }
        System.out.println(names);

    }
}
