package solved;

public class _32_ {
    public static void main(String[] args) {


        System.out.println(countRealDivisor(3, 0, 30));
    }

    private static int countRealDivisor(int n, int k, int m) {

        int result = 0;
        int count;
        for (int i = k; i <= m; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count++;
                }
            }
            if(count == n) {
                result++;
            }
        }
        System.out.println();
        return result;
    }
}
