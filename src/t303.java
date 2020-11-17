import java.util.Scanner;

public class t303 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if ((n % 10 == 1) & (n != 11)){
            System.out.println(n + " korova");
        }
        if ((n % 10 > 1) & (n % 10 < 5) & ((n < 10) | (n > 20))) {
            System.out.println(n + " korovy");
        }
        if ((n % 10 > 4) | (n % 10 == 0) | (n > 9) & (n < 21)) {
            System.out.println(n + " korov");
        }
    }
}
