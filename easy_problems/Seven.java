
// https://codeforces.com/problemset/problem/1593/A

import java.util.*;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            
            long A = Math.max(0, Math.max(b, c) + 1 - a);
            long B = Math.max(0, Math.max(a, c) + 1 - b);
            long C = Math.max(0, Math.max(a, b) + 1 - c);
            
            System.out.println(A + " " + B + " " + C);
        }
        
        sc.close();
    }
}