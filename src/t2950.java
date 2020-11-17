import java.util.Scanner;

public class t2950 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h, m;
        int a = s.nextInt();
        h = a * 45 + a / 2 * 5 + (a - 1) / 2 * 15;
        m = h % 60;

        System.out.print(9 + h/60 + " " + m);
    }
}
