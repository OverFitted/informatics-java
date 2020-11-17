import java.util.Scanner;

public class t350 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a, b, c, d, e;
        long f = 0;
        a = s.nextFloat();
        b = s.nextFloat();
        c = s.nextFloat();
        d = s.nextFloat();
        e = s.nextFloat();

        for (long x = 0; x <= 1000; x++) {
            if ((Math.abs((a * (x * x * x)) + (b * (x * x)) + (c * x) + d) <= 1e-7) & (x != e)) {
                f += 1;
            }
        }
        System.out.println(f);
    }
}