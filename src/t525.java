import java.util.Scanner;

public class t525 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, m, x, y;
        n = s.nextInt();
        m = s.nextInt();
        x = s.nextInt();
        y = s.nextInt();
        if (n < m) {
            int k = n;
            n = m;
            m = k;
        }
        System.out.println(Math.min(Math.min(m - x, x), Math.min(n- y, y)));
    }
}
