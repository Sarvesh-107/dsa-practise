package com.dsa;
import java.util.Scanner;
public class nestedswit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int empid = sc.nextInt();
        String dept = sc.next();

        switch (empid) {
            case 1 -> System.out.println("kunal kushawa");
            case 2 -> System.out.println("rahul rana");
            case 3 -> {
                System.out.println("emp 3");
                switch (dept) {
                    case "it" -> System.out.println("it dept");
                    case "mngt" -> System.out.println("management dept");
                }
            }
            default -> System.out.println("enter valid emp id");
        }

    }

}