import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] a = line.split(" ");
        int x = 2147483647;
        for (int i = 1; i < a.length; ++i) {
            if (Integer.parseInt(a[i]) > 0 && Integer.parseInt(a[i]) < x) {
                x = Integer.parseInt(a[i]);
            }
        }
        System.out.println(x);
    }
}

class Task_3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 2147483647;
        int N = in.nextInt();
        for (int i = 0; i < N; ++i) {
            int a = in.nextInt();
            if (a < x && a > 0) {
                x = a;
            }
        }
        System.out.println(x);
    }
}
