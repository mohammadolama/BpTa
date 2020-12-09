package TA_WEAK5;

import java.util.Scanner;

public class Queens_Ver2 {



    public static int queens(int queen , int i , boolean[] row , boolean[] col , boolean[] ghotr1 , boolean[] ghotr2 ){
        int ans=0;
        if (queen == 0){
            return 1;
        }
        if (i>row.length-1){
            return 0;
        }

        for (int j = 0; j < row.length; j++) {
            if (!row[i] && !col[j] && !ghotr1[i+j] && !ghotr2[i-j+row.length-1]){
                row[i]=true;
                col[j]=true;
                ghotr1[i+j]=true;
                ghotr2[i-j+row.length-1]=true;
                ans+=queens(queen-1, i+1 , row , col , ghotr1 , ghotr2 );
                row[i]=false;
                col[j]=false;
                ghotr1[i+j]=false;
                ghotr2[i-j+row.length-1]=false;
            }
        }
        return ans+queens(queen, i+1, row, col , ghotr1 , ghotr2);

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[n];
        boolean[] ghotr1=new boolean[2*n-1];
        boolean[] ghotr2=new boolean[2*n-1];
        System.out.println(queens(n , 0 , row , col , ghotr1 , ghotr2));
    }
}
