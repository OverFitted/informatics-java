import java.util.Scanner;

public class t2957 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        int nn = n % m;
        int mm = m % n;

        System.out.println(nn * mm + 1);
    }
}
