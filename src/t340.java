import java.util.Scanner;

public class t340 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        x = s.nextInt();

        for (int i = 1; i <= (x / 2) + 1; i++) {
            if (x % i == 0) {
                System.out.print(i + " ");
            }
        }
        if (x > 2) {
            System.out.println(x);
        }
    }
}