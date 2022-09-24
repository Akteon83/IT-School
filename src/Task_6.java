import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] input = line.split(" ");
        float x = Float.parseFloat(input[0]);
        float y = Float.parseFloat(input[1]);
        if (y < 2 - x * x && (y > x || (x > 0 && y >= 0))) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
