import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];          // ساخت آرایه برای نگهداری اعداد فیبوناچی

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {                  //رویه این قسمت به این صورت است که
                if (j == 0 || j == i) {                     // اعداد فیبوناچی را به صورت سطر به سطر در
                    a[i][j] = 1;                            // آرایه نگهداری میکنیم.اعداد وسط مجموع دو عدد
                } else {                                    // بالایی خود است .
                    a[i][j] = (a[i - 1][j] + a[i - 1][j - 1]) % 10;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");                  // چاپ اسپیس های قبل از اعداد در هر سطر
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(a[i][j] + " ");        // چاپ اعداد در هر سطر
            }
            System.out.println();                       // رفتن به خط بعدی
        }

    }
}
