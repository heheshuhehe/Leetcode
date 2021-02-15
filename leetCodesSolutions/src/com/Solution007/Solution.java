package com.Solution007;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
        public static Integer max =0;
        public int reverse (int testCase){
            int copytestCase=testCase;
//            int isMinus = (copytestCase<0?-1:1);
            Stack <Integer> zeros = new Stack<Integer>();
            int digit = 0; int bits = 0; int result = 0;
            while (testCase!=0){
                digit = testCase%10;
                zeros.push(digit);
                testCase/=10;
//                System.out.println("digit is "+ digit);
            }
            System.out.println("copy " + copytestCase);

            for (int i=0;zeros.size()>0;i++){
                result += (zeros.pop() * Math.pow(10,i));
//                System.out.println("result is "+  i);
                List <Integer> hehe = new ArrayList<Integer>();
                int[] hehe2;
                hehe2 = hehe.stream().mapToInt(Integer::valueOf).toArray();
            }
            result = (copytestCase<0?-result:result);
            System.out.println(String.valueOf(-result));
            return result ;
        }
}
