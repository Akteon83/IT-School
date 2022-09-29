import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int rabbits = 11;
        int wolves = 2;
        int eaten = 0;
        for (int i = 1; i <= N; ++i) {
            if (i % 2 == 1) {
                if (rabbits * 3 > 19000000) {
                    rabbits = 19000000;
                } else {
                    rabbits *= 3;
                }
            } else {
                if (rabbits >= 10 * wolves) {
                    rabbits -= 10 * wolves;
                    eaten += 10 * wolves;
                } else {
                    wolves -= wolves - (rabbits / 10);
                    eaten += 10 * (rabbits / 10);
                    rabbits -= rabbits / 10;
                }
            }
            wolves += eaten / 70;
            eaten -= eaten / 70 * 70;
        }
        System.out.println(rabbits + ", " + wolves);
    }
}
