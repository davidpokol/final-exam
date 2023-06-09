package hu.varga._29_;

public class PottyUtaniSzam {
    private static int method(double number) {
        return (int) (number % (int) number * 10);
    }

    public static void main(String[] args) {
        System.out.println(method(5.2));
    }
}
