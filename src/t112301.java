import java.util.Scanner;

public class t112301 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), t;
        int[] a;
        a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int k = s.nextInt() - 1, m = s.nextInt() - 1;
        int r = s.nextInt();

        for (int i = 0; i < k; i++){
            System.out.printf("%d ", a[i]);
        }
        if ((m - k) % 2 == 1){
            t = (m - k) / 2 + 1;
        }
        else{
            t = (m - k) / 2;
        }
        for (int i = k; i < k + t; i++) {
            System.out.printf("%d ", a[i + r]);
        }
        for (int i = k + t; i <= m; i++) {
            System.out.printf("%d ", a[i - r]);
        }
        for (int i = m + 1; i < n; i++) {
            System.out.printf("%d ", a[i]);
        }
    }
}
