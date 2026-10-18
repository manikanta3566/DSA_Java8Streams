package org.project.patterns.twopointers;

import com.sun.source.tree.NewArrayTree;
import org.project.questions.TwoSum;

public class TwoSumSortedArray {

    //ex 3,7,9,11  sum 16

    public static int[] twoSum(int[] arr,int sum){
        int left=0;
        int right=arr.length;

        while(left<right){
           if(arr[left]+arr[right]==sum){
               return new int[]{left,right};
           }else if(arr[left]+arr[right]>sum){
               left++;
           }else{
               right--;
           }
        }
        return new int[]{};
    }

}
