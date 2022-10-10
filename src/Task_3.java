import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[][] table = new String[n][n];
        int x = 0;
        int y = 0;
        int sign = 1;
        int num = 1;
        int counter = n - 1;
        table[y][x] = "  1";
        for (int i = 1; i <= counter; ++i) {
            x += sign;
            table[y][x] = Main.getSpace(++num);
        }
        while (counter != 0) {
            for (int i = 1; i <= counter; ++i) {
                y += sign;
                table[y][x] = Main.getSpace(++num);
            }
            sign *= -1;
            for (int i = 1; i <= counter; ++i) {
                x += sign;
                table[y][x] = Main.getSpace(++num);
            }
            counter -= 1;
        }
        for (int i = 0; i < n; ++i) {
            System.out.println(Arrays.toString(table[i]));
        }
    }
}
