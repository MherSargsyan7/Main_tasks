package training.java;

public class ArraySorts {
    public static void main (String [] args) {
        int [] arr = {2, 2, 5, 5, 5, 2, 2, 5, 2, 5, 2, 2};
        int[] sortedArr = new int[arr.length];
        int numberOfTwos = 0;
        for (int i=0; i < arr.length; i++) {
            if (arr[i]==2)
                numberOfTwos ++;
        }
        for (int i = 0; i < numberOfTwos; i++) {
            sortedArr[i] = 2;
        }
        for (int i = numberOfTwos; i < sortedArr.length; i++) {
            sortedArr[i] = 5;
        }
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }
}
