package solved;

import java.util.Date;
import java.util.Random;

public class _18_ {

    public static void main(String[] args) {

//        long a = System.currentTimeMillis();
       String str;
//        do {
            str = randomString(6);
//        } while (!str.contains("abcdef"));
//        long b = System.currentTimeMillis();
//
        System.out.println(str);
//        System.out.printf("it took %d milliseconds", b - a);
    }

    private static String randomString(int n) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.setLength(0);
            for (int i = 0; i < n; i++) {
                char c = (char)('a' + new Random().nextInt(('z' + 1) - 'a'));

                boolean uniqueLetter = true;
                for (int j = 0; j < sb.length(); j++) {
                    if (sb.charAt(j) == c) {
                        uniqueLetter = false;
                        break;
                    }
                }
                if (uniqueLetter) {
                    sb.append(c);
                } else {
                    break;
                }
            }
            if (sb.length() == n) {
                return sb.toString();
            }
        }
    }
}
