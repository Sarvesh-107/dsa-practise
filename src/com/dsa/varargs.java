package com.dsa;

public class varargs {
   public  static void main() {
      fun(2,3,4,5,5,67,8);
   }
        static void fun(int ...v){
            System.out.println(v);
        }

}
