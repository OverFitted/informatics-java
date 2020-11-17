import java.util.Scanner;

public class t351 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long f = 1;

        for (int x = 1; x <= n; x++) {
            f *= x;
        }
        System.out.println(f);
    }
}