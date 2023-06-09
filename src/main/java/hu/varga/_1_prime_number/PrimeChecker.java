package hu.varga._1_prime_number;

public class PrimeChecker {
    public static boolean isPrimeNumber(int i) {
        int factors = 0;
        int j = 1;

        while(j <= i)
        {
            if(i % j == 0)
            {
                factors++;
            }
            j++;
        }
        return (factors == 2);
    }

    public static void main(String[] args) {
        System.out.println("A megadott szám prím: " + isPrimeNumber(37));
    }
}
