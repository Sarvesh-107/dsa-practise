package leet;
import java.util.Scanner;
public class fibo {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int in=sc.nextInt();
        int a=0;
        int b=1;

        for(int n=0;n<in;n++){

          int temp=a+b;
           a=b;
           b=temp;
        }
        System.out.println(a);
    }
}
