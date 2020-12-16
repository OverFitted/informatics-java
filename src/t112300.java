import java.util.Scanner;

public class t112300 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a;
        a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int r = s.nextInt();

        for (int i = 0; i < n - r; i++) {
            System.out.printf("%d ", a[i + r]);
        }
        for (int i = 0; i < r; i++) {
            System.out.printf("%d ", a[i]);
        }
    }
}
