package solved_by_chatgpt;

public class _6_ {

    public static void main(String[] args) {

        System.out.println(calculateFibonacci(3));

    }
        public static int calculateFibonacci(int n) {

            if (n == 0) {
                return 0;
            } else if (n == 1 || n == 2) {
                return 1;
            }
            return calculateFibonacci(n - 2) + calculateFibonacci(n - 1);
        }
}
