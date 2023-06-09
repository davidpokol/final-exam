package solved;

public class _28_ {

    public static void main(String[] args) {

        char[][] tomb = {
                {'a', 'b', 'c', 'd', 'e'},
                {'f', 'a', 'h', 'i', 'j'},
                {'k', 'l', 'a', 'n', 'o'},
                {'p', 'q', 'r', 'a', 't'},
                {'u', 'v', 'w', 'í', 'a'}
        };

        System.out.println(arrayDecision(tomb));
    }


    private static boolean arrayDecision(char[][] array ) {

        for (int h = 0; h < array.length; h++) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {

                    if(i == j) {
                        continue;
                    }
                    if(array[h][h] == array[i][j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


}
