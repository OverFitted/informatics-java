import java.util.Scanner;

public class t320 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long f = s.nextLong();
        double n = 0;

        for (long i = 1; i <= f; i++) {
            n += 1. / (i * i);
        }

        System.out.println(n);
    }
}
