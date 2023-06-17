package solved;

public class _29_ {

    public static void main(String[] args) {

        System.out.println(afterDecimalPoint(5.26985496894568948659));

        //System.out.println(5.2 - 5);
    }


    private static int afterDecimalPoint(double number) {
        return Math.abs((int)(number % (int) number * 10));
    }
}
