import java.util.Scanner;

public class t3069 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = (long) -10e9, a_old = (long) 10e9, c = 0;

        while (a != 0){
            a = s.nextInt();

            if (a > a_old){
                c++;
            }
            a_old = a;
        }

        System.out.println(c);
    }
}
