package org.project.questions;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargetEle {

    public static int secondLargetEle(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();
//        int largest=0;
//        int secondLargest=0;
//        for(int ele:arr){
//
//            if(ele>largest){
//                largest=ele;
//                secondLargest=largest;
//            }else if(ele > secondLargest && ele != largest){
//                secondLargest=ele;
//            }
//
//        }
    }
}
