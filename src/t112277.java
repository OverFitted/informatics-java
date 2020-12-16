import java.util.Scanner;
import java.util.Random;

public class t112277 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = 0, a = s.nextInt(), b = s.nextInt(), n = s.nextInt();
        final Random random = new Random();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(b - a + 1) + a;
            if ((arr[i] / 10) % 10 % 2 == 0){
                k++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n" + k);
    }
}
