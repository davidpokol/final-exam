package main.java.hu.varga._3_StringRandomizer;

import java.util.Random;

public class StringRandomizer {
    private static char[] randomizeString(char[] array) {
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomIndex = r.nextInt(array.length);
            char temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.println(randomizeString("TesztElek".toCharArray()));
    }
}
