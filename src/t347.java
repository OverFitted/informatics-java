import java.util.Scanner;

public class t347 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, c;
        boolean f = false;
        n = s.nextInt();

        for (int i = 0; i < n; i++) {
            c = s.nextInt();
            if (c == 0 & !f) {
                System.out.println("YES");
                f = true;
            }
        }
        if (!f) {
            System.out.println("NO");
        }
    }
}