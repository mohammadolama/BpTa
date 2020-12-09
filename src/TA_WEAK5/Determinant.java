package TA_WEAK5;

import java.util.Scanner;

public class Determinant {

    static int mod = (int) 1e9 + 7;
    static int mode = 1000000007;

    public static void coFactor(long[][] matrix, long[][] tem, int ro, int co, int n) {
        int i = 0;        // for tem
        int j = 0;       // for tem
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row != ro && col != co) {
                    tem[i][j] = matrix[row][col];
                    j++;
                    if (j == n - 1) {
                        i++;
                        j = 0;
                    }
                }
            }
        }
    }


    public static long determinant(long[][] matrix, int n) {
        long result = 0;
        if (n == 1) {
            return matrix[0][0];
        } else {
            long[][] temp = new long[n - 1][n - 1];
            int sign = 1;

            for (int col = 0; col < n; col++) {

                coFactor(matrix, temp, 0, col, n);
                result = (result + matrix[0][col] * sign * determinant(temp, n - 1) % mod + mod) % mod;
                sign = -sign;

            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] matrix = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(determinant(matrix,n));
    }


//    static int mod =(int)1e9+7;
//
//    static void getCoFactor(long [][] matrix , long [][] temp , int ro , int co , int n){
//        int i =0;
//        int j = 0;
//        for (int row = 0; row < n; row++) {
//            for (int col = 0; col < n; col++) {
//                if (row != ro && col != co){
//                    temp[i][j] = matrix[row][col];
//                    j++;
//                    if (j==n-1){
//                        i++;
//                        j=0;
//                    }
//                }
//            }
//        }
//    }
//
//    public static long determinant(long[][] matrix , int n){
//        long result = 0;
//        if (n==1){
//            return matrix[0][0];
//        }else {
//            long[][] temp = new long[n-1][n-1];
//            int sign = 1;
//            for (int col = 0; col < n; col++) {
//                getCoFactor(matrix , temp , 0,col,n);
//                result = (result+ sign * matrix[0][col] * determinant(temp,n-1)%mod + mod) % mod;
//                sign = - sign;
//            }
//
//            return result;
//        }
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long[][] matrix = new long[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                matrix[i][j] = sc.nextInt();;
//            }
//        }
//        System.out.println(determinant(matrix , n));
//    }
}
