import java.util.Scanner;

public class t234 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        a = s.nextInt();
        b = s.nextInt();

        if (a >= b || b < 1605) {
            System.out.println(0);
        } else {
            int c = 0, i = a + 1;

            if (a < 1605) {
                i = 1605;
            } else {
                while (i % 10 != 5) {
                    i++;
                }
            }

            while (i <= b) {
                c++;
                i += 10;
            }
            
            System.out.println(c);
        }
    }
}
