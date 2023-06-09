package hu.varga._33_lkkt;

public class LKKT {
    private static void method(int a, int b) {
        int x = a, y = b;

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        int lkkt = x * y / a;
        int n = 0;
        System.out.println(lkkt);

        while(lkkt > 0) {
            lkkt /= 2;
            n++;
        }

        System.out.println("Számjegyek száma: " + n);
    }

    public static void main(String[] args) {
        method(87, 32);
    }
}
