import java.util.Scanner;

public class t342 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = 0;

        for (int i = 0; i < 100; i++) {
            c += s.nextInt();
        }

        System.out.println(c);
    }
}
