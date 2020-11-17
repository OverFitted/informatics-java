import java.util.Scanner;

public class t295 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a, b, c;
        a = s.nextFloat();
        b = s.nextFloat();
        c = s.nextFloat();

        if ((a + b > c) & (a + c > b) & (b + c > a)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
