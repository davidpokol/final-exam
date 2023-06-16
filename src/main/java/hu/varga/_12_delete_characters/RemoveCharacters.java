package main.java.hu.varga._12_delete_characters;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RemoveCharacters {
    private static String removeAllNonNumericCharacter(String a) {
        String b = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
                b += a.charAt(i);
            }
        }

        a = b;

        return a;
    }

    public static void main(String[] args) {
        System.out.println(removeAllNonNumericCharacter("Al4dár5Kört2e"));
        System.out.println(removeAllNonNumericCharacter("9gdf95gfdgfdgdfg1fgdgdfgfdg0fdgdf9gdgd8dg"));
        System.out.println(removeAllNonNumericCharacter("Sz3r3tem a k4kaós 1t4lt!"));



    }
}
