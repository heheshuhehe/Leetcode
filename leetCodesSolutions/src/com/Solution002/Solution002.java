package com.Solution002;

import com.entrance.entrance;

import java.util.Optional;

public class Solution002 {
    public Solution002(String pathName){
        System.out.println(Optional.ofNullable(pathName).orElse("hehe"));
        String content = entrance.readFileByChars(pathName);
    }

    public Solution002() {


    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return null;
    }
}
