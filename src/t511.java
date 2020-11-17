import java.util.Scanner;

public class t511 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, i, j, x, y1, y2;
        n = s.nextInt();
        i = s.nextInt();
        j = s.nextInt();
        x = i;
        y1 = -1;
        y2 = -1;

        while (x != j) {
            x = x + 1;
            if (x > n) {
                x = 1;
            }
            y1 = y1 + 1;

            if (x == j) {
                break;
            }
        }

        x = i;
        while (x != j) {
            x = x - 1;
            if (x < 1) {
                x = n;
            }
            y2 = y2 + 1;

            if (x == j) {
                break;
            }
        }
        if (y2 < y1) {
            System.out.println(y2);
        } else {
            System.out.println(y1);
        }
    }
}
