package main.java.hu.varga._6_fibonacci;

public class Fibonacci_Nth_Number {
    private static int fibonacciNthNumber(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacciNthNumber(number - 2) + fibonacciNthNumber(number - 1);
    }

    public static void main(String[] args) {
        System.out.println(fibonacciNthNumber(8));
    }
}
