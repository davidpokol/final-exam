package solved;

public class _33_ {

    public static void main(String[] args) {


        System.out.println(lkkt(32, 213));
    }

    private static int lkkt (int a, int b) {

        int x = a, y = b;
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        int lkkt = x * y / a;
        int n = 0;

        while(lkkt > 0) {
            lkkt /= 2;
            n++;
        }
        return n;
    }
}
