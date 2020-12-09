package TA_WEAK3;

import java.util.Scanner;

public class SumOfSubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        long[] a = new long[n + 1];
        long[] b = new long[n + 1];
        int[] begin = new int[m];
        int[] end = new int[m];
        a[0] = 0;
        for (int i = 1; i < n + 1; i++) {
            a[i] = scanner.nextLong();            // اعداد را از ورودی میگیریم و در آرایه a ذخیره کنیم.
        }
        for (int i = 0; i < m; i++) {
            begin[i] = scanner.nextInt();         // اعداد ابتدا و انتهای هر بازه را به ترتیب از ورودی
            end[i] = scanner.nextInt();           // میگیریم و در دو آرایه نگهداری میکنیم.
        }

        for (int i = 0; i < n + 1; i++) {
            if (i == 0) {                          // در خانه i ام آرایه b ، مجموع خانه های 0 تا i
                b[i] = 0;                          // آرایه a را  نگهداری میکنیم . برای تسریع در روند جمع
            } else {
                b[i] = b[i - 1] + a[i];            // دقت کنید که رابطه روبرو  را داریم :
            }
        }

        /*
        برای محاسبه مجموع اعداد در بازه ی [a,b] کافیست محاسبه کنیم :
        sum[a,b] = sum[0,b] - sum[0,a-1]
        */
        for (int i = 0; i < m; i++) {
            System.out.println(b[end[i]] - b[begin[i] - 1]);
        }

    }
}
