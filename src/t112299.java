import java.util.Arrays;
import java.util.Scanner;

public class t112299 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, b, n = s.nextInt();
        int[] a;
        a = new int[n];

        for (i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int k = s.nextInt() - 1, m = s.nextInt() - 1;

        for (; k < m; k++, m--) {
            b = a[k];
            a[k] = a[m];
            a[m] = b;
        }

        for (int element: a) {
            System.out.printf("%d ", element);
        }
    }
}
