package com.Solution005;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String longestPalindrome(String s) {
        String result ="";
        int maxLength =0;
        Map <String, Integer> currentMap= new HashMap<>();
        for (int i=0;i<s.length();i++){
            currentMap.put(String.valueOf(s.charAt(i)),i);
        }
        return result;
    }
}