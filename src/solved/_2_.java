package solved;

public class _2_ {

    public static void main(String[] args) {

    }

    public static boolean isPerfect(long number) {

        long sum = 0;

        for (long i = 1; i <= number; i++) {

            if(number % i == 0) {
                sum += i;
            }
        }
        return sum == number * 2;
    }
}
