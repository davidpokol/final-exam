package main.java.hu.varga._14_first_letter;

public class FirstLetter {
    private static String capitalizeFirstLetter(String str) {
        int diff = 'a' - 'A';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i - 1) == ' ') {
                sb.append((char) (str.charAt(i) - diff));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    private static char[] capitalizeFirstLetterWithChar(char[] array) {
        int diff = 'a' - 'A';
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i - 1] == ' ') {
                array[i] -= diff;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.println(capitalizeFirstLetterWithChar("zzz sss aaa ddd aa hhh lll_d_s fdds p".toCharArray()));
        System.out.println(capitalizeFirstLetter("zzz sss aaa ddd aa hhh lll_d_s fdds p"));
    }
}
