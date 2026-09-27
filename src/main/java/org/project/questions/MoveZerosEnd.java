package org.project.questions;

public class MoveZerosEnd {
    public static void moveZerosEnd(int[] arr) {
        int nonZeroEle = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroEle];
                arr[nonZeroEle++] = temp;
            }
        }
    }
}
