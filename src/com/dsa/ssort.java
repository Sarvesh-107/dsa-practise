package com.dsa;
import java.util.*;
public class ssort {
    static void main() {
        int[] arr ={3,2,1};
        int j;
        for(int i=0;i<arr.length-1;i++){
            int min=i;
        for(  j=i;j<arr.length;j++){
            if(arr[j]<arr[min]) min = j;
        }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    for(int x=0;x<arr.length;x++){
        System.out.println(arr[x]);
    }
    }
}