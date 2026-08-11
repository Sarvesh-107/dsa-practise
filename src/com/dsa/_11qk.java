package com.dsa;
import java.util.Scanner;

public class _11qk {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        boolean result = isprime(n);
        if(result)
        System.out.println("number is prime");
        else
            System.out.println("number isnt prime");

    }
        static boolean isprime(int n) {
        int c=0;
        for(int i=1;i<n;i++){
            if(n%i==0)
                c++;
        }
        if(c==1)
        return true;
        else
            return false;
        }

}
