package leet;

public class bott {
   public  static void main() {
int numBottles=13;
int numExchange=6;

       int max=numBottles;
       int q=numBottles;
while (q>=numExchange){
    q=(q-numExchange+1);
    numExchange++;
            max++;
    System.out.println("q="+q);
    System.out.println("numex="+numExchange);
    System.out.println("max="+max);
}
       System.out.println(max);
    }
}
