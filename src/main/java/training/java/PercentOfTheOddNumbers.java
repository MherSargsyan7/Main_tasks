package training.java;

public class PercentOfTheOddNumbers {
    public static double Example(double x){
        return  ((x * x)/100);
    }
    public static void main(String[] args) {
        short[] arr = {113, 4, 229, 7, 6, 222};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) ;
            Example(arr[i]);
            System.out.println(
                    arr[i] + " percent of " + arr[i] + " = " + Example(arr[i]));
        }
    }

}
