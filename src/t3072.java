import java.util.Scanner;

public class t3072 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = 0, a = 1, c = 0;

        while (a != 0){
            a = s.nextInt();

            if (a == m){
                c++;
            }
            else if(a > m){
                c = 1;
                m = a;
            }
        }

        System.out.println(c);
    }
}
