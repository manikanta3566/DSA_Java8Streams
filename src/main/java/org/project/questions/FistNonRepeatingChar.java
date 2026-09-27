package org.project.questions;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FistNonRepeatingChar {

    public static int fistNonRepeatingChar(List<Integer> arr) {
        return arr.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(map -> map.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
    }
}
