package org.project.questions;

import java.util.Arrays;

public class TwoAnagrams {

    public static boolean twoAnagrams(String s1, String s2) {
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }
}
