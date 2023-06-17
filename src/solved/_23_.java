package solved;

public class _23_ {

    public static void main(String[] args) {

        int[] example = new int[]{0,0,3,1,2};
       
       System.out.println(lastLongestIndex(example));
    }

    private static int lastLongestIndex(int[] array) {

        int maxLength = 1;
        int currLength = 1;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                currLength++;
            } else {
                currLength = 1;
            }
            if (currLength >= maxLength) {
                maxLength = currLength;
                maxIndex = i - currLength + 1;
            }
        }
        return maxIndex;
    }
}
