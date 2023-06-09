package solved;

public class _27_ {

    public static void main(String[] args) {


        System.out.println(divideSecondLeftDigit(-36,-36));
    }

    private static int divideSecondLeftDigit(int a, int b) {
        int multiplication = a * b >= 0 ? a * b : -a * b;
        return (multiplication % 100) / 10;
    }
}
