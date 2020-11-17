import java.util.Scanner;

public class t3076 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt();

        while (a != b) {
            if ((a / 2 >= b) && (a % 2 == 0)) {
                System.out.println(":2");
                a /= 2;
            } else {
                System.out.println("-1");
                a -= 1;
            }
        }

    }
}
