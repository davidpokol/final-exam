package main.java.hu.varga._8_nine;

public class Find9 {
    private static int findAll9(int number) {
        int count = 0;
        while (number >= 9) {
            if (number % 10 == 9) {
                count++;
            }

            number /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(findAll9(989439));
    }
}
