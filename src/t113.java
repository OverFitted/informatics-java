import java.util.Scanner;

public class t113 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i < ((int)StrictMath.sqrt(n) + 1); i++){
            System.out.println((int)Math.pow(i, 2));
        }
    }
}