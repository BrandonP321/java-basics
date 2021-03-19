package arrays.src;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] someArr = new int[5]; // initialize array of length 5
        System.out.println(Arrays.toString(someArr)); // [0, 0, 0, 0, 0]

        int[] myArr = { 5, 3, 2 }; // how to initialize array with values
        System.out.println(Arrays.toString(myArr)); // must convert array to string to print
        int[] coppiedArr = Arrays.copyOf(myArr, myArr.length); // must use Arrays.copyOf() to copy the contents of an array into another
        System.out.println(Arrays.toString(coppiedArr));

        int[] reverseArr = { 1, 2, 3, 4, 5 };
        reverse(reverseArr);
        System.out.println(Arrays.toString(reverseArr));
        
    }

    public static void reverse(int[] arr) {
        for (int i = 0; i < Math.floor(arr.length / 2); i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - (i + 1)];
            arr[arr.length - (i + 1)] = temp;
        }
    }
}
