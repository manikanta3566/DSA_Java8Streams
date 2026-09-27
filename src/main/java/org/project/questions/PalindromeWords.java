package org.project.questions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PalindromeWords {

    public static List<String> palindromeWords(List<String> words){
        return words.stream()
                .filter(word -> IntStream.range(0, word.length() / 2)
                        .allMatch(i ->
                                word.charAt(i) == word.charAt(word.length() - 1 - i)
                        ))
                .collect(Collectors.toList());
    }
}
