import java.util.Scanner;

public class t112145 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        System.out.printf("%d+%d+%d=%d\n", a, b, c, a + b + c);
        System.out.printf("%d*%d*%d=%d\n", a, b, c, a * b * c);
        System.out.printf("(%d+%d+%d)/3=%.3f\n", a, b, c, (float)(a + b + c) / 3);
    }
}
