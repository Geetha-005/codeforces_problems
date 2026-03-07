// 1433A --->A. Boring Apartments
//https://codeforces.com/problemset/problem/1433/A


import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();

            int d = x % 10; // the repeated digit
            int len = String.valueOf(x).length(); // number of digits

            int ans = (d - 1) * 10 + (len * (len + 1)) / 2;

            System.out.println(ans);
        }

        sc.close();
    }
}
