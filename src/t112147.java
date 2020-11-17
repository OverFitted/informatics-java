import java.util.Scanner;

public class t112147 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        float d = a;

        for (int i = 0; i < 9; i++) {
            a *= d;
        }
        System.out.printf("%.3f", a);
    }
}
