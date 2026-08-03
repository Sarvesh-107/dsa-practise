package com.dsa;
import java.util.Scanner;
public class fibo {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;

//        System.out.println("0");
//        System.out.println("1");
        for(int i=2;i<n;i++) {
            int nx = a + b;
            a=b;
            b=nx;
//            System.out.println(nx);
        }
        System.out.println(b);
    }
}
