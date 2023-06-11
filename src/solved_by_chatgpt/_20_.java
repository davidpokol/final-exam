package solved_by_chatgpt;

public class _20_ {

    public static void main(String[] args) {
        System.out.println(nChooseK(120,3));
    }

    private static long nChooseK(int n, int k) {
        if (k > n) return -1;  // base case - impossible to construct a combination
        if (n == k || k == 0) return 1; // base case - a combination was found

        return nChooseK(n - 1, k - 1) + nChooseK(n - 1, k);
    }
}