package com.company;


public class sort {
    public static void bubbleSort(int[] data){
        for(int barries = data.length -1; barries >=0 ; barries--){
            for(int index = 0; index < barries;index++){
                if(data[index] > data[index+1]) {
                    int tmp = data[index];
                    data[index] = data[index+1];
                    data[index+1] = tmp;

                }
            }
        }

    }
}
