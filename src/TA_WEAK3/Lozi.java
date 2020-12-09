package TA_WEAK3;

import java.util.Scanner;

public class Lozi {
    public static void main(String[] args) {

        /*
            Taymaz Khormali Code . All rights reserved :)

         */


        Scanner inputClass = new Scanner(System.in);
        int n = inputClass.nextInt();
        if (n == 1) {
            System.out.println("*");
            System.exit(0);
        }

        //***********************************************************************
        /*                 اولین سطر      */

        for (int i = n / 2; i >= 1; i--) {
            System.out.print(" ");
        }
        System.out.println("*");

        //***********************************************************************

        /*            نیمه بالایی              */
        for (int i = n / 2 - 1; i >= 1; i--) {
            for (int j = i; j >= 1; j--){
                System.out.print(" ");          // اسپیس های اول خط
            }
            System.out.print("*");              // اولین ستاره
            for (int j = 1; j <= n - 2 * i - 2; j++){
                System.out.print(" ");             // اسپیس های بین دو ستاره
            }
            System.out.println("*");                // ستاره آخر خط
        }

        //***********************************************************************

        /*           سطر وسط               */
        System.out.print("*");
        for (int i = 1; i <= n - 2; i++){
            System.out.print(" ");
        }
        System.out.println("*");


        //***********************************************************************

        /*           نیمه پایینی       */
        for (int i = 1; i <= n / 2 - 1; i++) {
            for (int j = i; j >= 1; j--){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= n - 2 * i - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //***********************************************************************


        /*          آخرین سطر            */
        for (int i = n / 2; i >= 1; i--){
            System.out.print(" ");
        }
        System.out.println("*");
    }
}
