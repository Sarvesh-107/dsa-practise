package com.dsa;

import java.util.Scanner;
public class swit {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
//        String fruit = sc.next();
//  if (fruit.equals("mango")) {
//      System.out.println("king of fruits");
//  }
//  if (fruit.equals("apple")){
//      System.out.println("sweet red fruit");
//  }
//         switch (fruit) {
//            case "mango" -> System.out.println("king of fruit");
//            case "apple" -> System.out.println("red fruit");
//            case "orange" -> System.out.println("cirus fruit");
//            case "grape" -> System.out.println("small fruit");
//            default -> System.out.println("enter a valid case ");
//        }
//
     int day=sc.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("weekend");
        }





    }

}
