import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] table = new int[n][m];
        for (int num = 0; num < m * n; ++num) {
            int i = num / m;
            int j = num % m;
            table[i][j] = i * j;
        }
    }
}
