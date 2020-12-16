import java.util.Scanner;

public class t112211 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt();
        boolean f = false;

        for (int i = a; i <= b; i++){
            if ((Math.pow(i, 2) % Math.pow(10, String.valueOf(i).length())) == i){
                System.out.print(i + " ");
                f = true;
            }
        }

        if (!f){
            System.out.println(-1);
        }
    }
}
