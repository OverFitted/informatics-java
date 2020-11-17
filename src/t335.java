import java.util.Scanner;

public class t335 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        a = s.nextInt();
        b = s.nextInt();

        for (int i = a; i <= b; i++) {
            if (i == (int)Math.sqrt(i) * (int)Math.sqrt(i)) {
                System.out.print(i + " ");
            }
        }
    }
}