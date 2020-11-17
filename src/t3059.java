import java.util.Scanner;

public class t3059 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int pow2 = 1;

        while (pow2 <= n)
        {
            System.out.printf("%d ", pow2);
            pow2 *=2;
        }
    }
}
