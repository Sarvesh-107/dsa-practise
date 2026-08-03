package leet;

public class prime {
    static void main() {
        int n=999983;
        int prime=0;
        if(n==2)
            prime=0;
        else {
        for(int i=1;i<n;i=i+2){
            int c=0;
            for(int x=2;x<=Math.sqrt(i);x++){
                if(i%x==0){
                    c++;
                }

            }
            if(c==0){
                prime++;
            }
        }}
        System.out.println(prime);
    }
}
