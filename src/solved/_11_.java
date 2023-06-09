package solved;

public class _11_ {

    public static void main(String[] args) {

        System.out.println(numberOfDivisor(64));
    }

    private static int numberOfDivisor(int number) {

        int count = 0;
        for (int i = 1; i <= number; i++) {

            if(number % i == 0) {
                count++;
            }
        }
        return count;
    }
}
