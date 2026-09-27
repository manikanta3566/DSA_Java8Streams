package org.project.questions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupInArr {

    public static int[] removeDupInArr(int[] arr) {
        Set<Integer> res = new HashSet<>();
        for (int ele : arr) {
            res.add(ele);
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}
