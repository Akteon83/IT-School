public class Fraction {
    private int numerator = 0;
    private int denominator = 1;

    Fraction(int numerator, int denominator) {
        System.out.println("1: I am constructor with numerator " + numerator + " denominator " + denominator);
        if (denominator == 0) {
            System.out.println("Divide by zero!!!");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
    }

    Fraction(int numerator) { // numerator/1 7/1
        this.numerator = numerator;
        System.out.println("2: I am constructor with numerator " + numerator);
    }

    Fraction() {
        System.out.println("3: I am an empty constructor");
    }

    Fraction(Fraction fraction) {
        this.numerator = fraction.numerator;
        this.denominator = fraction.denominator;
    }

    Fraction(float x) {
        numerator = (int) ((int) Math.pow(10, String.valueOf(x).split("\\.")[1].length()) * x);
        denominator = (int) Math.pow(10, String.valueOf(x).split("\\.")[1].length());
        normalize();
    }


    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    double toDecimal() {
        return (double) numerator / denominator;
    }

    public void sum(Fraction fraction) {
        int gcd = gcd(denominator, fraction.denominator);
        numerator = numerator * fraction.denominator / gcd + fraction.numerator * denominator / gcd;
        denominator = denominator * fraction.denominator / gcd;
        normalize();
    }

    public void mult(Fraction fraction) {
        numerator = numerator * fraction.numerator;
        denominator = denominator * fraction.denominator;
        normalize();
    }

    private int getGcd() {
        int a = numerator;
        int b = denominator;
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    private int gcd(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    void normalize() { // НОД - Наибольший Общий Делитель и НОК - Наименьшее Общее Кратное
        int gcd = getGcd();
        numerator /= gcd;
        denominator /= gcd;
    }
}
