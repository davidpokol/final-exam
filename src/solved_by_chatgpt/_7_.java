public class _7_ {

    public static void main(String[] args) {
        System.out.println(getIntegerPower(00));

        System.out.println(Math.pow(15,2));

    }


    private static int getIntegerPower(int num) {

        int i = 0;
        int power = 1;

        if(num < 2) {
            return -1;
        }

        while (power * num <= 567) {
            power *= num;
            i++;
        }

        return i;
    }
}
