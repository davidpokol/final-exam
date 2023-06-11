package solved_by_chatgpt;

import java.util.Arrays;
import java.util.Random;

public class _3_ {


    public static void main(String[] args) {


        System.out.println(Arrays.toString(shuffleString("alma".toCharArray())));
        String lajos = "";
    }


    public static char[] shuffleString(char[] chars) {
        Random random = new Random();

        for (int i = chars.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        return chars;
    }
}
