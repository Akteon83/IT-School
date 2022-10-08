public class NumberDigits {
    public static int sumOfSeven(int a, int b) {
        int counter = 0;
        for (int i = a; i <= b; ++i) {
            if (i >= 10 && i <= 99 && i % 7 == 0) {
                counter += i / 10 + i % 10;
            }
        }
        return counter;
    }
}
