import java.util.Scanner;

public class t3063 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt(), p = s.nextInt(), y = s.nextInt(), k = 0;

        x *= 100;
        y *= 100;
        while (x < y) {
            k++;
            x *= 1 + p / 100.;
        }

        System.out.println(k);
    }
}
