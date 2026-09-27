package org.project.questions;

public class FindMissingNumber {

    public static int findMissingNumber(int[] arr,int N){
        int expectedSum=N*(N+1)/2;
        int crrOutput=0;
        for(int ele:arr){
            crrOutput=crrOutput+ele;
        }
        return expectedSum-crrOutput;
    }
}
