package com.Solution002;

import com.entrance.entrance;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Solution002 {
    private ListNode list1 = new ListNode();
    private ListNode list2 = new ListNode();

    /**
     *
     * @param pathName
     */
    public Solution002(String pathName) {
        pathName = null;
        String content = entrance.readFileByChars(Optional.ofNullable(pathName).orElse("002.txt"));
        String[] arrays = (content.split("\n"));
        String[] array1 = arrays[0].split(",");
        String[] array2 = arrays[1].split(",");
        ListNode list1 = this.list1;
        ListNode list2 = this.list2;
        ListNode previousNode = new ListNode();
        for (String number : array1) {
            list1.val = Integer.valueOf(number);
            list1.next = new ListNode();
            previousNode=list1;
            list1 = list1.next;
        }
        previousNode.next=null;

        for (String number : array2) {
            list2.val = Integer.valueOf(number);
            list2.next = new ListNode();
            previousNode=list2;
            list2 = list2.next;
        }
        previousNode.next=null;

//        while (this.list1 != null) {
//            System.out.println("list1.val is " + this.list1.val);
//            this.list1 = this.list1.next;
//        }
//
//        while (this.list2 != null) {
//            System.out.println("list2.val is " + this.list2.val);
//            this.list2 = this.list2.next;
//        }
        this.addTwoNumbers(list1,list2);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        while (l1!=null ||l1 !=null){

        }
        return null;
    }
}
