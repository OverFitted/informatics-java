import java.util.Scanner;

public class t3062 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float x = s.nextInt();
        int y = s.nextInt(), i = 1;

        while (x < y){
            x *= 1.1;
            i++;
        }

        System.out.println(i);
    }
}
