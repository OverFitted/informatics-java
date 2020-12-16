import java.util.Scanner;

public class t112275 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        for (int i = size; i >= 1; i--) {
            System.out.print((int)Math.pow(2, i) + " ");
        }
    }
}
