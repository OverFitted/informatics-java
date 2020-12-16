import java.util.Scanner;

public class t112274 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt(), d = s.nextInt(), n = s.nextInt();
        int[] a = new int[n + 1];
        a[n] = x;

        for (int i = n - 1; i > 0; i--) {
            a[i] = x + d;
            x = a[i];
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
