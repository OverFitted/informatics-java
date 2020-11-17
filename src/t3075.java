import java.util.Scanner;

public class t3075 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        if (a == 1) {
            System.out.println(1);
        } else {
            int f1 = 0, f2 = 1, f3 = 1, c = 2;
            while (f3 < a) {
                f1 = f2;
                f2 = f3;
                f3 = f1 + f2;
                c++;
            }
            if (f3 != a) {
                System.out.println(-1);
            } else {
                System.out.println(c);
            }
        }
    }
}
