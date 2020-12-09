package TA_WEAK4;

import java.util.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class AboutMap {
    public static void main(String[] args) {
//        HashMap<String, String> map = new HashMap<>();


//        HashMap<String, Integer> map = new HashMap<>();
//
//        map.put("vishal", 10);
//        map.put("sachin", 30);
//        map.put("vaibhav", 20);
//       Integer k =  map.put("vaibhav", 30);
//        Integer t = map.put("ali" , 40);

//        System.out.println(k);
//        System.out.println(t);

//        for (Map.Entry<String, Integer> e : map.entrySet()) {
//            System.out.println(e.getKey() + " " + e.getValue());
//        }
//        System.out.println("*****************");
//        System.out.println(map.get("vishal"));
//        System.out.println(map.get("mohammad"));

//        map.remove("sachin");
//        for (Map.Entry<String, Integer> e : map.entrySet()) {
//            System.out.println(e.getKey() + " " + e.getValue());
//        }
//
//        map.remove("mohammad");
//        for (Map.Entry<String, Integer> e : map.entrySet()) {
//            System.out.println(e.getKey() + " " + e.getValue());
//        }

//        map.remove("vishal", 60);
//        for (Map.Entry<String, Integer> e : map.entrySet()) {
//            System.out.println(e.getKey() + " " + e.getValue());
//        }
//
//        System.out.println("********************************");
//        map.remove("vishal", 10);
//        for (Map.Entry<String, Integer> e : map.entrySet()) {
//            System.out.println(e.getKey() + " " + e.getValue());
//        }

//        map.replace("vaibhav", 30 , 40);

//        System.out.println("********************************");
//
//        LinkedHashMap<String, Integer> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("vishal", 10);
//        linkedMap.put("sachin", 30);
//        linkedMap.put("vaibhav", 20);
//
//        for (Map.Entry<String, Integer> entry : linkedMap.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }


        System.out.println("*******************");

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("b", 3);
        treeMap.put("c", 1);
        treeMap.put("a", 2);
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
