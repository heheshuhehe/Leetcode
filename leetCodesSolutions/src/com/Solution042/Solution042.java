package com.Solution042;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution042 {
    public int start(String inputString){
        String [] testChars= inputString.split(",");
        int[] testNums = Arrays.asList(testChars).stream().mapToInt(Integer::parseInt).toArray();
        System.out.println ("int [] is "+ Arrays.toString(testNums));
        return  trap(testNums);
    }
    public int trap(int[] height) {
        int[] sortedHeight = Arrays.copyOf(height, height.length);
        Arrays.sort(sortedHeight);
        System.out.println("sorted height is "+ Arrays.toString(sortedHeight));
        Integer[] hehe= {1,2,3};
        Arrays.copyOf()

        return 0;
    }
}
