package training.java;

public class RandomNumber {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            double random = Math.random() * 100 + 1;
            int randomnumber = (int) random;
            System.out.println(randomnumber);
        }
    }

}
