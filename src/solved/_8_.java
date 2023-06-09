package solved;

public class _8_ {

    public static void main(String[] args) {


        //System.out.println(12345%10);
        //System.out.println(12345/10);

        System.out.println(countNines(19191919));
    }


    private static int countNines(int number) {

        int count = 0;

        while (number >= 9) {
            int a = number % 10;

            if(a == 9) {
                count ++;
            }
            number = number / 10;
        }

        return count;
    }
}
