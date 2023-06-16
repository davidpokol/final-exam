package solved;

import java.util.Random;

public class _19_ {
    public static void main(String[] args) {

        System.out.println(insterter("test string"));
    }

    private static String insterter(String s) {

        StringBuilder sb = new StringBuilder();
        int index = new Random().nextInt(s.length());
        for (int i = 0; i < index; i++) {

            sb.append(s.charAt(i));
        }
        sb.append('a');
        for (int i = index; i< s.length(); i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
