package TA_WEAK5;

import java.util.ArrayList;
import java.util.Scanner;

public class TowerOfHanoi_Ver2 {



    public static int towerofhanoi(int num , char from_rod , char to_rod , char aux_rod , ArrayList<String> list){
        int sum = 0;
        if (num == 1){
            list.add(from_rod+" "+to_rod);
            return 1;
        }else {
            sum+=towerofhanoi(num-1 , from_rod , aux_rod , to_rod , list);
            sum++ ;
            list.add(from_rod+" "+to_rod);
            sum += towerofhanoi(num-1 , aux_rod , to_rod , from_rod , list);
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();;
        ArrayList<String> list = new ArrayList<>();
        System.out.println(towerofhanoi(n, 'A', 'C', 'B', list));
        for (String s : list) {
            System.out.println(s);
        }
    }
}
