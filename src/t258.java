import java.util.Scanner;

public class t258 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, m, k;
        n = s.nextInt();
        m = s.nextInt();
        k = s.nextInt();
        if (((k % n == 0) | (k % m == 0)) & (k < n * m)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
