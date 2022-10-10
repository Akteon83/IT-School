import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[][] table = new String[2 * n + 1][2 * n + 1];
        int x = n;
        int y = n;
        int sign = -1;
        int num = 0;
        int counter = 1;
        table[y][x] = "  0";
        while (x != 2 * n) {
            for (int i = 1; i <= counter; ++i) {
                y += sign;
                table[y][x] = Main.getSpace(++num);
            }
            for (int i = 1; i <= counter; ++i) {
                x += sign;
                table[y][x] = Main.getSpace(++num);
            }
            counter += 1;
            sign *= -1;
        }
        for (int i = 1; i <= counter - 1; ++i) {
            y += sign;
            table[y][x] = Main.getSpace(++num);
        }
        for (int i = 0; i < 2 * n + 1; ++i) {
            System.out.println(Arrays.toString(table[i]));
        }
    }
}
