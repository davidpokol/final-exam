package main.java.hu.varga._9_binary;

public class BinaryChecker {
    private static void isZeroOrOne(int number) {
        number /= 2;
        System.out.println((byte) number % 2);
    }

    public static void main(String[] args) {
        isZeroOrOne(23);
    }
}
