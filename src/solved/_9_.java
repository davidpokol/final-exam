package solved;

public class _9_ {

    public static void main(String[] args) {

        byte b = zeroOrOne(10);
        System.out.println(b);
    }

    private static byte zeroOrOne(int number) {
        number /= 2;
        return (byte) (number % 2);
    }
}
