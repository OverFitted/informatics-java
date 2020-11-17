import java.util.Scanner;

public class t304 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), a, b, c;
        a = n / 60;
        b = (n % 60) / 10;
        c = n % 10;
        if (c * 15 > 125) {
            c = 0;
            b += 1;
        }
        if (c * 15 + b * 125 > 440) {
            c = 0;
            b = 0;
            a += 1;
        }
        System.out.printf("%d %d %d", c, b, a);
    }
}
