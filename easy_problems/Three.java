
// https://codeforces.com/problemset/problem/1788/A

import java.util.*;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            int totalTwos = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 2) totalTwos++;
            }

            int leftTwos = 0;
            int ans = -1;

            for (int k = 0; k < n - 1; k++) {
                if (a[k] == 2) leftTwos++;

                int rightTwos = totalTwos - leftTwos;

                if (leftTwos == rightTwos) {
                    ans = k + 1; // because k is index, answer is position
                    break;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}