package solved;

public class _13_ {

    public static void main(String[] args) {

        System.out.println(isPalindrome("i            i             i"));
    }

    private static boolean isPalindrome(String str) {

        int j = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {

            while (str.charAt(i) == ' ') {
                i++;
            }

            while (str.charAt(j) == ' ') {
                j--;
            }

            if (i >= j) {
                break;
            }
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }
}
