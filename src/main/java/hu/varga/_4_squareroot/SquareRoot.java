package hu.varga._4_squareroot;

public class SquareRoot {
    private static double sqrt(double n) {
        double gy, ujgy, d, eps;
        gy = 1.0;
        d = 1.0;
        eps = 0.00001;
        while (d > eps)
        {
            ujgy = (1.0 / 2) * (gy + (n / gy));
            d = ujgy - gy;
            if (d < 0) d = -d;
            gy = ujgy;
            return gy;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(5.5));
    }
}
