package com.entrance;

import java.util.List;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        String recieverString = s;
        String currentString ="";
        int maxLength=0;
        int currentStringHeadIndex=0;
        for (int i=0;i<recieverString.length();i++){
            if (!currentString.contains(String.valueOf((recieverString.charAt(i))))){
                currentString+=(recieverString.charAt(i));
                maxLength=maxLength>currentString.length()?maxLength:currentString.length();
            }else{
                currentStringHeadIndex += currentString.indexOf(recieverString.charAt(i))+1;
                currentString = String.valueOf((recieverString.charAt(currentStringHeadIndex)));
                i=currentStringHeadIndex;
            }
            System.out.println("maxlength is "+maxLength);
            System.out.println("currentString is "+currentString+", and current length is "+currentString.length());
        }

        return maxLength;
    }
}