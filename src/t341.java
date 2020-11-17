import java.util.Scanner;

public class t341 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = 0, s = 0, q;
        int x = sc.nextInt();
        q = (int) Math.sqrt(x);

        for (int i = 1; i <= q; i++) {
            if (x % i == 0) {
                d += 1;
                s = i;
            }
        }

        d *= 2;

        if (s * s == x) {
            d -= 1;
        }

        System.out.println(d);
    }
}
