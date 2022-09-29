import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String N = in.nextLine();
        int min = 9;
        for (int i = 0; i < N.length(); ++i) {
            int x = Character.getNumericValue(N.charAt(i));
            if (x < min && x != 0) {
                min = x;
            }
        }
        System.out.println(min);
    }
}
