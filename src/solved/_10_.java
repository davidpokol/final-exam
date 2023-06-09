package solved;

public class _10_ {

    public static void main(String[] args) {
        series(4);
    }

    private static void series(int x) {

        int i = 0;
        int j = 0;
        int count = 0;
        while (count != 5){

            if(i++ % 2 == 0) {
                j++;
            } else {
                j += 2;
            }

            if(j % x == 0) {
                System.out.println(j);
                count++;
            }
        }
    }
}
