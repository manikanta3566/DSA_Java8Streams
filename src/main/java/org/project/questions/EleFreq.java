package org.project.questions;

public class EleFreq {

    public static void countEleBF(String s){
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int count=0;
            boolean alreadyCounted=false;
            for(int k=0;k<i;k++){
                if(ch==s.charAt(k)){
                    alreadyCounted=true;
                    break;
                }
            }
            if(alreadyCounted){
                continue;
            }
            for(int j=0;j<s.length();j++){
                if(ch==s.charAt(j)){
                   count++;
                }
            }
            System.out.println(ch + " = "+count);
        }
    }

    public static void countEleOptimized(String s){
        int[] freq=new int[26];
//        int OddCount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int value = freq[ch - 'a'];
            freq[ch - 'a']=value+1;
        }

        for(int j=0;j<26;j++){
            if(freq[j]>0){
//                if(freq[j]%2!=0){
//                    OddCount++;
//                }
                System.out.println((char) ('a'+j) + " = "+freq[j]);
            }
        }
//        if(OddCount<=1){
//            System.out.println("palindrome");
//        }else{
//            System.out.println("not a palindrome");
//        }
    }
}
