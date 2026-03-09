
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int cost;

            if (b < 2 * a) {
                cost = (n / 2) * b + (n % 2) * a;
            } else {
                cost = n * a;
            }

            System.out.println(cost);
        }

        sc.close();
    }
}