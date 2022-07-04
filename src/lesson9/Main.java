package lesson9;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int [] nums = {6,3,1,4,2,5};
//        printChars("dean");
//
//        System.out.println(countas("deaan"));

        System.out.println(min(nums));
    }

    public static void printChars(String str) {
        if (str == null || str.equals(""))
            return;
        else {
            System.out.println(str);
            printChars(str.substring(1));
        }
    }

    public static int countas(String str){
        if (str == null || str.equals("")) {
            return 0 ;
    }
        else{
            if(str.charAt(0) == 'a')
                return 1 + countas(str.substring(1));
            else
                return 0 + countas(str.substring(1));
        }
    }

    public static int min(int [] arr){
        return min(arr,0);
    }

    public static int min(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        int val = min(arr, index + 1);

        if (arr[index] < val)
            return arr[index];
        else
            return val;
    }


}
