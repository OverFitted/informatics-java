import java.util.Scanner;

public class t2944 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        System.out.println(i % 10 + i / 10 % 10 + i / 100 % 100);
    }
}
