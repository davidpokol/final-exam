package solved;

public class _29_ {

    public static void main(String[] args) {

        System.out.println(afterDecimalPoint(5.26985496894568948659));

        //System.out.println(5.2 - 5);
    }


    private static int afterDecimalPoint(double number) {

        double fractionalPart = number - (int) number;

        int  decimalDigit = (int) (fractionalPart * 10);

        return decimalDigit >= 0 ? decimalDigit : -decimalDigit;
    }
}
