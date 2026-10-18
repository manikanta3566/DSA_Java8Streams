package org.project.patterns.twopointers;

import java.util.Arrays;

public class SortColors {

    //0 red
    //1 blue
    //2 green
    //input [1,2,0,1,2,0,0,1,2] output [0,0,0,1,1,1,2,2,2]

    public static void sortColorsBruteForced(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        int k = 0;
        for (int i = 0; i < count0; i++) {
            arr[k++] = 0;
        }
        for (int i = 0; i < count1; i++) {
            arr[k++] = 1;
        }
        for (int i = 0; i < count2; i++) {
            arr[k++] = 2;
        }

        System.out.println(Arrays.toString(arr));
    }

    //0 red
    //1 blue
    //2 green
    //input [1,2,0,1,2,0,0,1,1] output [0,0,0,1,1,1,2,2,2]
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                nums[mid] = nums[low];
                nums[low] = 0;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                nums[mid] = nums[high];
                nums[high] = 2;
                high--;
            }
        }
    }

}