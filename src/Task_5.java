import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] input = line.split(" ");
        int x = 0;
        for (int i = 0; i <= 2; i++) {
            if (Integer.parseInt(input[i]) >= 100 && Integer.parseInt(input[i]) <= 999 && Integer.parseInt(input[i]) % 5 == 0) {
                x += 1;
            }
        }
        if (x >= 2) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
