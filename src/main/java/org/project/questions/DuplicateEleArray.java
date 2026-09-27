package org.project.questions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateEleArray {

    public static Set<Integer> duplicateEleArray(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!seen.add(arr[i])) {
                res.add(arr[i]);
            }
        }
        return res;
    }
}
