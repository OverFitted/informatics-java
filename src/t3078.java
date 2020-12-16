import java.util.Scanner;

public class t3078 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = 1, m = 1, a, b, x = 1, y = 1;
        b = s.nextInt();
        do {
            a = b;
            b = s.nextInt();
            if (b > a) k++;
            else {
                if (k > m) m = k;
                k = 1;
            }
            if (b < a) x++;
            else {
                if (x > y) y = x;
                x = 1;
            }

        }
        while (b != 0);
        System.out.println(Math.max(m, y));
    }
}
