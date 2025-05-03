public class Fraction {
    private   int numerator;
    private int denominator;

    private Fraction (int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    public void setFraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator < 0) throw new IllegalArgumentException ("denominator must be positive");
        this.denominator = denominator;
    }


    // Нахождение наибольшего общего делителя
    public static int euclideanAlgorithm(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }



    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
