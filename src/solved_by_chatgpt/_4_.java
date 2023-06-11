package solved_by_chatgpt;

public class _4_ {

    public static void main(String[] args) {

        System.out.println(squareRoot(94));
    }
    public static double squareRoot(double a) {
        double x = 1.0;
        double epsilon = 1e-6; // Pontosság (választható), ugyan az mint az 0.00001

        while (true) {
            double xNext = 0.5 * (x + a / x);
            if (Math.abs(xNext - x) < epsilon) { // Megállási feltétel: ha a következő közelítés már elég közel van az előzőhöz
                return xNext;
            }
            x = xNext;
        }
    }
}
