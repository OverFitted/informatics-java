import java.util.Scanner;

public class t266 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1, y1, x2, y2;
        x1 = s.nextInt();
        y1 = s.nextInt();
        x2 = s.nextInt();
        y2 = s.nextInt();
        if ((x1 * x2 > 0) & (y1 * y2 > 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
