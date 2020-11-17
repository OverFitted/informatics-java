import java.util.Scanner;

public class t346 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, z = 0, p = 0, m = 0;
        n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            if (a == 0) {
                z++;
            } else if (a > 0) {
                p++;
            } else {
                m++;
            }
        }
        System.out.printf("%d %d %d", z, p, m);
    }
}