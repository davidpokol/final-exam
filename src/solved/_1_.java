package solved;

public class _1_ {
    public static void main(String[] args) {


        for (int i =0; i<= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }



    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for(int i = 2; i <=number/2; i++) {

            if(number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
