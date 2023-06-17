package solved_by_chatgpt;

public class _7_ {

    public static void main(String[] args) {
        System.out.println(Math.pow(15,3));
        System.out.println(getIntegerPower(15));
    }


    private static int getIntegerPower(int num) {

        int power = 1;

        if (num < 2) {
            return -1;
        }

        while (power * num < 567) {
            power *= num;
        }
        return power;
    }
}
