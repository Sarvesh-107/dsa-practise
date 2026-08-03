package com.dsa;
import java.util.Scanner;
public class upper {
    public static void main (String[]args ){
        Scanner sc=new Scanner (System.in);
        char ch= sc.next().trim().charAt(0);
//        System.out.println(ch);
        if(ch>='a' && ch<='z'){
            System.out.println("lowercase");
        }
        else
        {
            System.out.println("uppercase");
        }
    }
}
