import java.util.Scanner;

public class t2947 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        while (a / 60 > 23) {
            a -= 60 * 24;
        }
        System.out.print(a / 60 + " " + a % 60);
    }
}
