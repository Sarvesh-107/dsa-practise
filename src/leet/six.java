package leet;

public class six {
    static void main() {
        int n=69969;
        int i=10;
        int c=1;
        do{
            if(n/i==0){
                break;
            }
            else{
                c++;
                i=i*10;
            }
        }while(n>i);



    }
}
