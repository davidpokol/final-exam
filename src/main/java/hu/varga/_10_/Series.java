package main.java.hu.varga._10_;

public class Series {
    private static void method(int number) {
        if (number <= 1 || number >= 10) {
            return;
        }

        int i = 0;
        int j = 0;
        int count = 0;
        while (count != 5) {

            if (i++ % 2 == 0) {
                j++;
            } else {
                j += 2;
            }

            if (j % number == 0) {
                System.out.println(j);
                count++;
            }
        }


    }

    public static void main(String[] args) {
        method(10);
    }
}
