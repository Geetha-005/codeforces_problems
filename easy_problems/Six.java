
// https://codeforces.com/problemset/problem/1777/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            int operations = 0;
            int count = 1;

            for (int i = 1; i < n; i++) {
                if ((a[i] % 2) == (a[i - 1] % 2)) {
                    count++;
                } else {
                    operations += count - 1;
                    count = 1;
                }
            }

            operations += count - 1;

            System.out.println(operations);
        }
    }
}