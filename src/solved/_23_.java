package solved;

public class _23_ {

    public static void main(String[] args) {

        int[] example = new int[]{0,6,1,2};

        System.out.println(lastLongestIndex(example));
    }

    private static int lastLongestIndex(int[] array) {

        int longestIndex = 0;
        int longestSize = 1;
        int i = 1;
        while (i < array.length) {

            if (array[i] <= array[i - 1]) {
                int j = i;
                int size = 0;
                while (j < array.length - 1 && array[j] < array[j + 1]) {
                    j++;
                    size++;
                }
                if (size >= longestSize) {
                    longestSize = size;
                    longestIndex = i;
                }
                i = j;
            }
            i++;
        }
        return longestIndex;
    }
}
