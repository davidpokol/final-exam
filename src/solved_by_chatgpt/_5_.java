package solved_by_chatgpt;

public class _5_ {

    public static void main(String[] args) {

        //System.out.println(sqr(27));
    }

    public static double sqr(double a) {
        double x = 1.0; // kezdőérték

        while (true) {
            double xNext = (2 * x + a / (x * x)) / 3; // köbgyök iteráció
            if (Math.abs(xNext - x) < 0.00001) { // ellenőrzés a konvergencia közelítéséhez
                return xNext; // konvergált köbgyök visszaadása
            }
            x = xNext; // következő iterációhoz frissítjük x értékét
        }
    }
}
