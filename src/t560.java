import java.util.Scanner;

public class t560 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m, n, k, i;
        n = s.nextInt();
        m = s.nextInt();
        k = s.nextInt();

        if ((m > n) & (k >= n)) {
            System.out.println("NO");
        } else {
            if (n >= m) {
                i = 1;
            } else {
                i = (m - k - 1) / (n - k) + 1;
            }
            System.out.println(i);
        }
    }
}