import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        char x = in.next().charAt(0);
        String line = String.valueOf(a);
        String finale = "";
        for (int i = 0; i < line.length(); ++i) {
            if (line.charAt(i) != x) {
                finale += line.charAt(i);
            }
        }
        System.out.println(finale);
    }
}
