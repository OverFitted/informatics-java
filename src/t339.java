import java.util.Scanner;

public class t339 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        x = s.nextInt();

        for (int i = 2; i <= 1000000; i++) {
            if (x % i == 0) {
                System.out.print(i);
                break;
            }
        }
    }
}