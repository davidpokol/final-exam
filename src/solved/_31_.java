package solved;

public class _31_ {
    public static void main(String[] args) {

        int[][] array = {
                { 9, 4, 20, 7 },
                { 3, 6, 100, 8 },
                { 10, 12, 11, 14 },
                { 15, 13, 16, 5 }
        };

        System.out.println(hasProperElement(array));

    }

    private static boolean hasProperElement(int[][] array) {

        for (int i = 0; i < array.length; i++) { // sor
            for (int j = 0; j < array[i].length; j++) { //oszlop --> elem
                int currElement = array[i][j];
                boolean isProper = true;
                for (int k = 0; k < array.length; k++) {

                    if ((j != k && currElement <= array[i][k]) ||
                         i != k && currElement >= array[k][j]) {
                            isProper = false;
                            break;
                        }
                    }

                if (isProper) {
                    System.out.println(currElement);
                    return true;
                }
            }
        }
        return false;
    }
}
