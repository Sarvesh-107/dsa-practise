package com.dsa;
import java.util.Scanner;
public class calc {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       while (true) {
           System.out.println("enter operation");
           char op= sc.next().trim().charAt(0);
           if( op =='+' || op=='-' || op=='*' || op=='/' || op=='%')
           {
               System.out.println("enter 2 numbers");
          int a=sc.nextInt();
          int b=sc.nextInt();
           if(op=='+'){
               System.out.println(a+b);
           }
               if(op=='-'){
                   System.out.println(a-b);
               }
               if(op=='*'){
                   System.out.println(a*b);
               }
               if(op=='/'){
                   System.out.println(a/b);
               }
               if(op=='%'){
                   System.out.println(a%b);
               }


           }


       }
    }
}
