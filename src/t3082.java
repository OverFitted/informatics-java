import java.util.Scanner;

public class t3082 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int LIMIT = (int) (1e5 + 10);
        int a = s.nextInt(), b = s.nextInt(), n = s.nextInt();
        char min = 'A', max = 'B';
        boolean poss = false;
        if (b < a) {
            int tmp = a;
            a = b;
            b = tmp;
            char tmp_c = max;
            max = min;
            min = tmp_c;
        }
        int bVal = 0, aVal = 0;

        int k = 0;
        do {
            if (bVal + a <= b) {
                bVal += a;
                aVal = 0;
            } else {
                aVal = b - bVal;
                bVal = b;
            }
            k += 2;
            if ((n == bVal) || (n == aVal)) {
                poss = true;
            }
        } while (k <= LIMIT);

        aVal = 0;
        bVal = 0;

        if (poss) {
            do {
                System.out.printf(">%c\n", min);
                System.out.printf("%c>%c\n", min, max);
                if (bVal + a <= b) {
                    bVal += a;
                    aVal = 0;
                } else {
                    bVal += a;
                    aVal = bVal - b;
                    bVal = b;
                }
            } while ((n != bVal) && (n != aVal));
        } else
            System.out.println("Impossible");
    }
}
