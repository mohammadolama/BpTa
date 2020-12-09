package TA_WEAK4;

import java.util.*;

public class AboutList {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();

        list.add(3.5);
        list.add(3.0);
        list.add(8.0);
        list.add(5.0);
        list.add(2.0);
        list.add(0.4);
        list.add(1, 0.7);
        System.out.println(list.toString());

//        list.remove(2);
//        System.out.println(list.toString());
//
//        list.remove(5.0);
//        System.out.println(list.toString());

//        list.add(8 , 0.6);
//        System.out.p
//        rintln(list.toString());

//        list.remove(2.5);
//        System.out.println(list.toString());
//        System.out.println(list.contains(0.7));
//        System.out.println(list.contains(0.8));

//        for (int i = 3; i < list.size(); i++) {
//                System.out.println(list.get(i));
//        }
//
//        System.out.println(list.contains(0.5));
//        System.out.println(list.contains(5.0));
//        System.out.println(list.indexOf(0.3));
//        System.out.println(list.indexOf(3.0));

//        list.set(2 , 4.0);
//        System.out.println(list.toString());


        List<String> names = new ArrayList<>();
        names.add("ali");
        names.add("hasan");
        names.add("mojtaba");

//        String[] nameArray = (String[]) names.toArray();
//        String[] namesArray = names.toArray(new String[0]);
//        for (String s : namesArray) {
//            System.out.println(s);
//        }

//        for (Double aDouble : list) {
//            if (aDouble > 1.0){
//                list.remove(aDouble);
//            }
//        }
//        System.out.println(list.toString());

//        ListIterator<Double> li = list.listIterator();
//        while (li.hasNext()) {
//            if (li.next() > 1.0) {
//                li.remove();
//            }
//        }
//        System.out.println(list.toString());

//        List<Integer> row1=new ArrayList<>(Arrays.asList(1,2,3,4));
//        List<Integer> row2=new ArrayList<>(Arrays.asList(5,6,7,8));
//        List<List<Integer>> matrix = new ArrayList<>();
//        matrix.add(row1);
//        matrix.add(row2);
//        System.out.println(matrix.toString());

        LinkedList<String> mylinked = new LinkedList<>();
        

    }
}
