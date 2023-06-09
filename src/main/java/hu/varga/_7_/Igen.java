package hu.varga._7_;

public class Igen {
    private static int method(int number) {
        int csucsPont = 567;
        int i = 1;

        if (number < 2) {
            System.out.println("0 vagy 1 esetén végtelen a ciklus!");
            return 1;
        }

        while(Math.pow(number, i) < csucsPont) {
            i++;
        }

        return i - 1;
    }


    public static void main(String[] args) {
        System.out.println((int)(5.2 % 5 * 10));
    }
}
