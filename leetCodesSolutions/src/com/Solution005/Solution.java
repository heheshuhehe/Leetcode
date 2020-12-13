package com.Solution005;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        int maxLength = 1;
        int currentLength = 0;
        int maxIndex = 0;
        int sIndex= 0;
        boolean isPalindromeFlg=true;
        Map <String, Integer> currentMap= new HashMap<>();
        for (int mIndex=0;mIndex<s.length();mIndex++){
            sIndex= mIndex;
            currentLength=0;
            for (int mTailIndex = s.length()-1;mTailIndex>=sIndex;mTailIndex--){
                if (s.charAt(sIndex)==s.charAt(mTailIndex)){
                    currentLength+=(sIndex==mTailIndex?1:2);
                    sIndex++;
                }else {
                    currentLength=0;
                    sIndex=mIndex;
                }
                System.out.println("currentLength is "+currentLength + ", mIndex is "+mIndex+", sIndex is "+(sIndex-1) + ", mTailIndex is "+mTailIndex);
            }
            if ( currentLength > maxLength)  {
                maxLength = currentLength;
                maxIndex = mIndex;
            }
        }
        System.out.println("maxIndex is " + maxIndex + ", maxLength is "+maxLength);
        result = s.substring(maxIndex,maxIndex+maxLength);
        return result;
    }
}