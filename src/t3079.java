import java.util.Scanner;

public class t3079 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b = s.nextInt(), c = s.nextInt(), k = 0;

        while (c != 0) {
            a = b;
            b = c;
            c = s.nextInt();
            if (b > a && b > c && c != 0) k++;
        }

        System.out.println(k);
    }
}
