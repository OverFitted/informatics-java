import java.util.Scanner;

public class t265 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k, m, n, t;
        k = s.nextInt();
        m = s.nextInt();
        n = s.nextInt();
        if (n <= k) {
            t = 2 * m;
        } else if (n * 2 % k == 0) {
            t = m * (n * 2 / k);
        } else {
            t = m * (1 + (n * 2 / k));
        }
        System.out.println(t);
    }
}
