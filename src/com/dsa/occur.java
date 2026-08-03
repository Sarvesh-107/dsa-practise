package com.dsa;
import java.util.Scanner;
public class occur {
    public static void main(String[] args){
           int count=0;
           int n=45538;
           Scanner sc=new Scanner(System.in);
           int c=sc.nextInt();
           while (n>0)
           {
              int x=n%10;
              if(x==c)
              {
                  count++;
              }
           n=n/10;

           }
   System.out.println(count);

}
}
