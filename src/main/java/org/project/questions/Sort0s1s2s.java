package org.project.questions;

public class Sort0s1s2s {

    public static void sort0s1s2s(int[] arr){
        int count0=0;
        int count1=0;
        int count2=0;

        for(int ele : arr){
            if(ele==0){
                count0++;
            } else if (ele==1) {
                count1++;
            }else{
                count2++;
            }
        }

        int index=0;
        for(int i=0;i<count0;i++){
            arr[index++]=0;
        }
        for(int i=0;i<count1;i++){
            arr[index++]=1;
        }
        for(int i=0;i<count2;i++){
            arr[index++]=2;
        }
    }
}
