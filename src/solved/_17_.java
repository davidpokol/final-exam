package solved;

public class _17_ {


    public static void main(String[] args) {
        ascii();
    }

    private static void ascii() {
        for (int i = 'a'; i <= 'z'; i++ ) {
            int j = 0;
            while (j * j <= i) {
                if(j * j == i) {
                    System.out.printf("%c, %d %n", (char) i, i);
                }
                j++;
            }
        }
    }
}
