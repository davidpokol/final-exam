package solved;

public class _30_ {
    public static void main(String[] args) {


        System.out.println(swap(302));
    }

    private static int swap(int num) {
        int a = num;

        int length = 0;
        while (a > 0) {
            a/=10;
            length++;
        }
        int swapped = 0;
        while (num>0) {

            swapped += (int) Math.pow(10, --length) * (num % 10);
            num /= 10;
        }
        return swapped;
    }
}
