package training.java;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        int[] arr = new int [] {12, 7, 661, 27, 95, 11, 0};
        reversArr(arr, arr.length );
    }
    public static void reversArr (int[] arr, int length) {
        int[] newArray = new int[length];
        int i = length;
        for (int j = 0; j < length; j++) {
            newArray[i - 1] = arr[j];
            i--;
        }
        System.out.println(Arrays.toString(newArray));
    }


}
