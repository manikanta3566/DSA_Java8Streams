package org.project.questions;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int right = arr.length;
        int left = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
