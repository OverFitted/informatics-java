import java.util.Scanner;

public class t3066 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0, c = 0, cur;

        while (true){
            cur = s.nextInt();

            if (cur == 0){
                break;
            }
            else{
                sum += cur;
                c++;
            }
        }

        System.out.println((double) sum / c);
    }
}
