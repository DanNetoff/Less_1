package com.company;


public class methods {

    public static void invertToArray(int arr[]){
        for (int i = 0; i < arr.length/2; i++) {
            int tmp = arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1] = tmp;
        }
    }
}
