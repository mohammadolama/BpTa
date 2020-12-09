package TA_WEAK5;

import java.util.Scanner;

public class TowerOfHanoi {
//    static int ans = 0;


    public static void f(int n, char mabda, char maghsad, char komaki) { // 3 A C B
        // 2 A B C
        // 1 A C B ...
        // A -> B
        // 1 C B A

        // A -> c
        // 2 B C A
        if (n == 0) return;
        f(n - 1, mabda, komaki, maghsad);
        System.out.println(mabda + " " + maghsad);
        f(n - 1, komaki, maghsad, mabda);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = (int) (Math.pow(2,n)) - 1;
        System.out.println(ans);
        f(n,'A','C','B');
    }
}