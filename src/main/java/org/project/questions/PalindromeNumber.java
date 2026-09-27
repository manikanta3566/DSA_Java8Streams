package org.project.questions;

public class PalindromeNumber {
    public static boolean palindromeNumber(int num) {
        int original = num;
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;//calculate last digit
            rev = rev * 10 + digit; //put in rev
            num = num / 10; //remove the last ele
        }
        return original == rev;
    }
}
