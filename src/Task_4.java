import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x = Float.parseFloat(in.nextLine());
        if ((x >= -2 && x <= 3) || (x >= 6 && x <= 9)) {
            System.out.println("false");
        }
        else {
            System.out.println("true");
        }
    }
}
