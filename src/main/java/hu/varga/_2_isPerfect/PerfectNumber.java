package main.java.hu.varga._2_isPerfect;

public class PerfectNumber {
    private static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (number * 2 == sum) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfect(28));
    }
}
