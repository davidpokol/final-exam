package solved;

public class _15_ {

    public static void main(String[] args) {

        System.out.println(removeChar2("almacskaka", 'a'));
    }

    private static String removeChar(String str, char c) {

        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == c) {
              str = str.substring(0,i) + str.substring(i + 1);
            }

        return str;
    }

    private static String removeChar2(String str, char c) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i< str.length(); i++) {
            if (str.charAt(i) != c) {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}
