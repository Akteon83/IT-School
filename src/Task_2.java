import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] input = line.split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);
        int af = a * n + b * n / 100;
        int bf = b * n % 100;
        System.out.println(af + " " + bf);
    }
}
