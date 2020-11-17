import java.util.Scanner;

public class t3058 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), i = 2;

        while (n % i != 0) {
            i++;
        }
        System.out.println(i);

    }
}
