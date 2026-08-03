package leet;

public class intersection {
    static void main() {
        int arr1 []={1,2,3,4};
        int arr2 []={3,4,6,5};
        int arr3[]= new int[8];
        for(int ele:arr1){
            for(int i=0;i< arr2.length;i++){
                if(ele==arr2[i]){

                    for(int a:arr3){
                        System.out.println(a);
                }
            }
        }

        }
    }
}
