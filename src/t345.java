import java.util.Scanner;

public class t345 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, f = 0;
        n = s.nextInt();

        for (int i = 0; i < n; i++) {
            if (s.nextInt() == 0) {
                f++;
            }
        }
        System.out.println(f);
    }
}