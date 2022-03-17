package training.java;

public class CalcArrSum {
    public static void calcSum(double[] arr, int N) {
        double sum = 0;
        if (N <= 0) {
            System.out.println("Can't calculate. Number should be greater than 0");
        } else {
            for (int i = 0; i < N; i++) {
                sum = sum + arr[i];
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        calcSum(new double[]{-1.0, 0.8, 14.9, 5.5, 0.4, -19.7}, -5);
    }
}

