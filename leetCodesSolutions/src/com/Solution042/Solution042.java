package com.Solution042;

import java.util.Arrays;

public class Solution042 {
    public int start(String inputString){
        String [] testChars= inputString.split(",");
        int[] testNums = Arrays.asList(testChars).stream().mapToInt(Integer::parseInt).toArray();

        return  trap(testNums);
    }
    public int trap(int[] height) {
        System.out.println ("int [] is "+ height );
        return 0;
    }
}
