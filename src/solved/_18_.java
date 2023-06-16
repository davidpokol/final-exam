package solved;

import java.util.Date;
import java.util.Random;

public class _18_ {

    public static void main(String[] args) {

//        long a = System.currentTimeMillis();
       String str;
//        do {
            str = randomString();
//       } while (!str.contains("abcde"));
//        long b = System.currentTimeMillis();

        System.out.println(str);
//        System.out.printf("it took %d milliseconds", b - a);*/
    }

    private static String randomString() {

        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        char c;
        while (sb.length() < 5) {
            do {
                c = (char) r.nextInt('a', 'z' + 1);
            } while (sb.toString().contains(String.valueOf(c)));
            sb.append(c);
        }
        return sb.toString();
    }
}
