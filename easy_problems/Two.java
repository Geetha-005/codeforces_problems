// https://codeforces.com/problemset/problem/1971/A 

import java.util.*;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        for(int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int min = Math.min(x, y);
            int max = Math.max(x, y);

            System.out.println(min + " " + max);
        }

        sc.close();
    }
}