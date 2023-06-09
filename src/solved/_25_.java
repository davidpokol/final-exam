package solved;

public class _25_ {

    public static void main(String[] args) {

        System.out.println(getIndexOfNChar("karaktertömb".toCharArray() , 'k', 1));
    }

    private static int getIndexOfNChar(char[] s, char c, int n) {

        int count = 0;
        int i = 0;
        for (char cc : s) {
            if(cc == c && ++count == n) {
                return i + 1;
            }
            i++;
        }
        return -1;
    }
}
