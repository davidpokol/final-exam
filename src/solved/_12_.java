package solved;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class _12_ {


    public static void main(String[] args) {

        long time = new Date().getTime();
        System.out.println(justNumbers("glkd4566asfd4536afsd435gfads"));
        System.out.printf("string concatenation: %d%n", new Date().getTime() - time);


        time = new Date().getTime();
        System.out.println(justNumbers2("glkd4566asfd4536afsd435gfads"));
        System.out.printf("sb: %d", new Date().getTime() - time);

    }


    // feladatleíráshoz hűbb, de bad practice
    private static String justNumbers(String str) {

        List<Character> keep = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                keep.add(str.charAt(i));
            }
        }

        str = "";

        for (int i = 0; i < keep.size(); i++) {
            str += keep.get(i);
        }

        return str;

    }

    //good practice, de nem az 'str'-t módosítom.
    private static String justNumbers2(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}
