package solved;

public class _24_ {

    public static void main(String[] args) {

        System.out.println(smallestIndex(new int[] {2 ,2 ,0, 0, 0, 1}));
    }

    private static int smallestIndex(int[] array) {

        int firstTwoMultiplication = array[0] * array[1];

        int sum = 0;

        for (int i = 0; i < array.length - 1; i++) {

            sum += array[i];
            if (sum > firstTwoMultiplication) {
                return i + 1;
            }
        }

        return 0;
    }

}
