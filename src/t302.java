import java.util.Scanner;

public class t302 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c, d, e, f, g, h;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if ((a + b <= c) | (a + c <= b) | (b + c <= a)) {
            System.out.println("impossible");
        } else {
            if (a > b) {
                f = a;
            } else {
                f = b;
            }

            if (c > f) {
                f = c;
            }

            if (a < b) {
                h = a;
            } else {
                h = b;
            }

            if (c < h) {
                h = c;
            }

            g = a + b + c - f - h;
            d = h * h + g * g;
            e = f * f;

            if (d > e) {
                System.out.println("acute");
            } else if (d < e) {
                System.out.println("obtuse");
            } else {
                System.out.println("right");
            }
        }
    }
}
