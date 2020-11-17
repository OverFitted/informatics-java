import java.util.Scanner;

public class t257 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        int x2 = s.nextInt();
        int y2 = s.nextInt();

        if ((Math.abs(x2 - x1) == 2 & Math.abs(y2 - y1) == 1) | (Math.abs(x2 - x1) == 1 & Math.abs(y2 - y1) == 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
