package hu.varga._27_szorzat_masodik_szamjegye;

public class Nem {
    private static int method(int a, int b) {
        int number = a * b;
        if (number < 10) {
            System.out.println("A szorzat csak egy számjegyű!");
            return 0;
        }

        while (number >= 100) {
            number /= 10;
        }

        return number % 10;
    }

    public static void main(String[] args) {
        System.out.println(method(55, 89));
    }
}
