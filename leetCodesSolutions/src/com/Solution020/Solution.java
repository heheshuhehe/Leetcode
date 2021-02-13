package com.Solution020;


import java.util.Stack;

public class Solution {
        public Boolean isValid (String testCase){
            char target;
            if (testCase==null||testCase.length()%2!=0)return false;
            Stack <Character> reading = new Stack<>();
            for (int i=0;i<testCase.length();i++) {
                target = testCase.charAt(i);
//                System.out.println("target is "+target);
                if (target == '(' || target == '[' || target =='{'){
//                    System.out.println("pushing "+target);
                    reading.push(target);
                } else {
                    switch (target){
                        case ')':{
                            if (reading.size()<1||reading.pop()!='(') return false;
                            break;
                        }
                        case ']':{
                            if (reading.size()<1||reading.pop()!='[') return false;
                            break;
                        }
                        case '}':{
                            if (reading.size()<1||reading.pop()!='{') return false;
                            break;
                        }
                        default:{
                            return false;
                        }
                    }
                }
            }
            if (reading.size()!=0)return false;
            return true;
        }
}
