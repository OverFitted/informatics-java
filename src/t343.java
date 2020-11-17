import java.util.Scanner;

public class t343 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, su = 0;
        n = s.nextInt();

        for (int i = 0; i < n; i++) {
            su += s.nextInt();
        }
        System.out.println(su);
    }
}