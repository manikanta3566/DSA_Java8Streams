package org.project;

import java.util.Arrays;
import org.project.questions.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //two sum
        int[] res = TwoSum.twoSum(new int[]{3, 8, 7, 5, 4}, 15);
//        System.out.println(Arrays.toString(res));

        int[] ele = new int[]{1, 0, 3, 0, 0, 5, 6};
        MoveZerosEnd.moveZerosEnd(ele);

//        System.out.println(Arrays.toString(ele));

//        System.out.println(ReverseString.reverseString("two"));

//        System.out.println(TwoAnagrams.twoAnagrams("silen","listen"));

//        System.out.println(DuplicateEleArray.duplicateEleArray(new int[]{1,2,2,5,6,7,7}));

//        System.out.println(FistNonRepeatingChar.fistNonRepeatingChar(List.of(4,2,2,5,6,6)));

//        System.out.println(FindMissingNumber.findMissingNumber(new int[]{1,2,4,5,6},6));

//        System.out.println(BinarySearch.binarySearch(new int[]{1,4,7,8,9,10},9));

//        System.out.println(PalindromeString.palindromeString("madam"));

        int[] arr= new int[]{0,2,2,1,0,0,1};
        Sort0s1s2s.sort0s1s2s(arr);
        System.out.println(Arrays.toString(arr));
    }
}