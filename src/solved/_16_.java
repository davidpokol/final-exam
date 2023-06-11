package solved;

public class _16_ {

    public static void main(String[] args) {

        System.out.println(countInnerString("llllllll l l", "ll"));

    }

    private static int countInnerString(String str, String innerStr) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == innerStr.charAt(0) && str.length() - i >= innerStr.length()) {
                int k = i;
                int j = 0;
                while (j < innerStr.length() && str.charAt(k) == innerStr.charAt(j)) {
                    k++;
                    j++;
                }
                if(j == innerStr.length()) {
                    count++;
                    if (i!= str.length() -1) {
                        i = k - 1;
                    }
                }
            }
        }
        return count;
    }
}
