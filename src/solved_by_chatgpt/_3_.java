package solved_by_chatgpt;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class _3_ {


    public static void main(String[] args) {


        System.out.println(shuffleString("alma"));
    }


    public static String shuffleString(String input) {
        char[] characters = input.toCharArray();
        Random random = new Random();

        for (int i = characters.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
        }

        return new String(characters);
    }

}
