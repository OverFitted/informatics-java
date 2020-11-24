import java.util.Scanner;

public class t3077 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int prev = -1, cl = 0, ml = 0, a = s.nextInt();

        while (a != 0){
            if (prev == a){
                cl++;
            }
            else{
                prev = a;
                ml = Math.max(ml, cl);
                cl = 1;
            }
            a = s.nextInt();
        }
        ml = Math.max(ml, cl);
        System.out.println(ml);
    }
}
