package solved;

public class _22_ {

    public static void main(String[] args) {

        System.out.println(isHaveMultipleTimes(new int[] {2,2,1}));

    }

    private static boolean isHaveMultipleTimes(int[] array) {

        int preCount = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j]) {
                    count++;
                }
            }

            if (i == 0) {
                preCount = count;
            } else if (preCount != count){
                return true;
            }
            count = 0;
        }
        return false;
    }
}
