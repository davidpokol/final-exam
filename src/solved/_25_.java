package solved;

public class _25_ {

    public static void main(String[] args) {

        System.out.println(getIndexOfNChar("karaktertömb", 'k', 1));
    }

    private static int getIndexOfNChar(String s, char c, int n) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == c && ++count == n) {
                return i + 1;
            }
        }
        return -1;
    }
}
