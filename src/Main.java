public class Main {
    public static void main (String[] args) {
        //Nothing really important here... I love The Beatles btw.
    }
    public static String getSpace(int a) {
        if (a >= 100) {
            return String.valueOf(a);
        } else if (a >= 10) {
            return " " + a;
        } else {
            return "  " + a;
        }
    }
}
