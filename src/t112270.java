import java.util.Scanner;

public class t112270 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int f = s.nextInt(), size=s.nextInt();

        for (int i = 0; i < size; i++){
            System.out.print(i + f + " ");
        }
    }
}
