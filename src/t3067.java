import java.util.Scanner;

public class t3067 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = 0, cur;

        while (true){
            cur = s.nextInt();

            if (cur == 0){
                break;
            }
            else{
                if (cur % 2 == 0) {
                    c++;
                }
            }
        }

        System.out.println(c);
    }
}
