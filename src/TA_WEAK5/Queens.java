package TA_WEAK5;

import java.util.Scanner;

public class Queens {
    static boolean[] satr;
    static boolean[] ghotr1; // i-j
    static boolean[] ghotr2; // i+j


    static int f(int n, int soton) {
        int a = 0;
        for (int i = 0; i < n; i++) {
            if (satr[i] == true) {
                a++;
            }
        }
        if (a == n) return 1;
        // if (soton==n) return 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            // vazir to i soton
            if (satr[i] == false && ghotr1[i - soton + n - 1] == false && ghotr2[i + soton] == false) {
                satr[i] = true;
                ghotr1[i - soton + n - 1] = true;
                ghotr2[i + soton] = true;
                int ans = f(n, soton + 1);
                sum += ans;
                satr[i] = false;
                ghotr1[i - soton + n - 1] = false;
                ghotr2[i + soton] = false;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        satr = new boolean[n];
        ghotr1 = new boolean[2 * n - 1];
        ghotr2 = new boolean[2 * n - 1];
        System.out.println(f(n,0));
    }
}
