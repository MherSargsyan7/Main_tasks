package training.java;

public class MaxParametr {
    public static int maxNumber(int a, int b) {
        int resulte;
        if(a > b)
            resulte = a;
        else
            resulte = b;
        return resulte;
    }
    public static void main(String[] args) {
        int k = 11;
        int x = 38;
        int max = maxNumber(k, x);
        System.out.println("The maximum number is " +max);
    }

}
