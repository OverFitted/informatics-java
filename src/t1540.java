import java.util.Scanner;

public class t1540 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), i;
        while (n > 9) {
            i = n % 10;
            n = n / 10;
            n = n + i;
        }
        System.out.println(n);
    }
}
