package solved;

public class _21_ {

    public static void main (String[] args) {

        System.out.println(isHaveDivider(new int[] {2,23423243}));

    }

    private static boolean isHaveDivider(int[] array) {

        for(int i = 0; i < array.length; i++) {

            int j;
            for(j = 0; j < array.length; j++) {

                if(i == j) {
                    continue;
                }

                int a;
                int b;

                if(array[i] > array[j]) {
                    a = array[i];
                    b = array[j];

                } else {
                    a = array[j];
                    b = array[i];

                }

                if(a % b !=0) {
                    break;
                }

                if(j == array.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}