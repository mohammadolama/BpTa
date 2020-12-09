package TA_WEAK3;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int[] b= new int[n];
        int[] a = new int[n];
        for (int i = 0 ; i<n ; i++){
            b[i]=scanner.nextInt();         // دو آرایه را بدین گونه میسازیم. توجه داریم که آرایه a در واقع
            a[i]=i;                         // اندیسی از خانه های b است .
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (b[j] > b[j+1]){
                    int temp = b[j];            // کافیست در حین مرتب کردن اعداد در b
                    b[j]=b[j+1];                // اعداد a را نیز با همان ترتیب جا به جا کنیم
                    b[j+1] = temp;
                    int temp2 = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp2;
                }

            }
        }

        String s="";
        for (int i = 0; i < n; i++) {
            s = s + " " + (a[i] + 1 );
        }
        s= s.trim();
        System.out.println(s);

    }
}
