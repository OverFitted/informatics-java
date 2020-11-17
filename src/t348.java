import java.util.ArrayList;
import java.util.Scanner;

public class t348 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c, d;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = s.nextInt();
        ArrayList<Integer> r = new ArrayList<>();

        for (int x = 0; x < 1001; x++) {
            if (Math.abs(a * x * x * x + b * x * x + c * x + d) <= 1e-7) {
                r.add(x);
            }
        }

        for (int i = 0; i < r.size(); i++) {
            System.out.print(r.get(i) + " ");
        }
    }
}

