import java.util.Scanner;

public class t2945 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        System.out.println(a - a % 2 + 2);
    }
}
