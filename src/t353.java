import java.util.Scanner;

public class t353 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long f = 0;

        for (int i = 0; i <= n; i++) {
            f += StrictMath.pow(2, i);
        }
        System.out.println(f);
    }
}