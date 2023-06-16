package main.java.hu.varga._11_divisors;

public class Divisors {
    static int divisorsCountOfNaturalNumber(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(divisorsCountOfNaturalNumber(6));
    }
}
