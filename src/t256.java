import java.util.Scanner;

public class t256 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1, x2, y1, y2;
        x1 = s.nextInt();
        y1 = s.nextInt();
        x2 = s.nextInt();
        y2 = s.nextInt();
        if ((Math.abs(x1 - x2) == Math.abs(y1 - y2)) | (x1 == x2) | (y1 == y2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
