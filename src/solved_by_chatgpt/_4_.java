public class _4_ {

    public static void main(String[] args) {

        System.out.println(squareRoot(74));
    }

        public static double squareRoot(double a) {
            double x = 1.0;
            double epsilon = 1e-6; // Pontosság (választható)

            while (true) {
                double xNext = 0.5 * (x + a / x);

                // Megállási feltétel: ha a következő közelítés már elég közel van az előzőhöz
                if (Math.abs(xNext - x) < epsilon) {
                    break;
                }

                x = xNext;
            }

            return x;
        }
}
