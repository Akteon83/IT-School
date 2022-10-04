import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 2147483647;
        int N = in.nextInt();
        for (int i = 0; i < N; ++i) {
            int a = in.nextInt();
            if (a > x) {
                System.out.println(a);
            }
            x = a;
        }
    }
}

class Task_4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] A = in.nextLine().split(" ");
        for (int i = 2; i < A.length; ++i) {
            if (Integer.parseInt(A[i]) > Integer.parseInt(A[i - 1])) {
                System.out.print(A[i] + " ");
            }
        }
    }
}
