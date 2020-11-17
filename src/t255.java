import java.util.Scanner;

public class t255 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        byte x1, y1, x2, y2;
        x1 = s.nextByte();
        y1 = s.nextByte();
        x2 = s.nextByte();
        y2 = s.nextByte();
        if ((x1 + y1 == x2 + y2) | (x1 - y1 == x2 - y2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
