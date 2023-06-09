package solved;

public class _14_ {

    public static void main(String[] args) {

        System.out.println(upperCased("zzz xxx yyy hk ut out_we a"));

    }


    private static String upperCased(String str) {
        int difference = 'a' - 'A'; // a = 97, A = 65
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {

            if (i == 0 || str.charAt(i - 1) == ' ') {
                sb.append((char)(str.charAt(i) - difference));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
