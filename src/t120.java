import java.util.Scanner;

public class t120 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double f = 1, sum = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
            sum += 1 / f;
        }
        System.out.println(sum);
    }
}