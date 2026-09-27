package org.project.questions;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] input){
        Map<String,List<String>> output=new HashMap<>();
        for(String in : input){
            char[] cha=in.toCharArray();
            Arrays.sort(cha);
            String key=Arrays.toString(cha);
            if(output.containsKey(key)){
               output.get(key).add(in);
            }else{
                List<String> list=new ArrayList<>();
                list.add(in);
                output.put(key,list);
            }
        }
        return output.values().stream().toList();
    }

}
