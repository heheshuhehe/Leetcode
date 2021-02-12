package com.Solution020;

public class Solution {
        public Boolean isValid (String testCase){
            char target;
            int bracket=0,mediumBracket=0,largeBracket=0;
            for (int i=0;i<testCase.length();i++) {
                target = testCase.charAt(i);
                switch (target) {
                    case '(':
                        bracket++;
                    case '{':
                        mediumBracket++;
                    case '[':
                        largeBracket++;
                    case ')':
                        if (--bracket<0) return false;
                    case '}':
                        if (--mediumBracket<0) return false;
                    case ']':
                        if (--largeBracket<0) return false;
                    default:
                        return false;
                }
            }
            return true;
        }
}
