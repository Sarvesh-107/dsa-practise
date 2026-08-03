package com.dsa;

public class reverse {
     public static void main(String []args){
    int x=2359;
    int y;
    int rev=0;
    while(x>0)
    {
        int i=10;
        y=x%i ;
         rev=rev*10+y;
        x=x/10;


    }
         System.out.println(rev);
     }
}
