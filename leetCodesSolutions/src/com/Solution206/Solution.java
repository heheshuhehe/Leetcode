package com.Solution206;
import com.DataStructure.ListNode;

import java.util.List;

public class Solution {
    private ListNode numList;

    public String start (String testCase){
        numList= ListNode.transferFromStringToNumList(numList, testCase);
        ListNode.printListNode(numList);
        System.out.println("The reversed list node is ");
        ListNode.printListNode(reverseList(numList));
        return "";
    }

    public ListNode reverseList(ListNode head) {
        if (head ==null) return null;
        ListNode Pointer = null;
        ListNode PreviousPointer = null;
        while (head!=null){
            Pointer = new ListNode();
            Pointer.val = head.val;
            Pointer.next = PreviousPointer;
            PreviousPointer = Pointer;
            head = head.next;
        }
        return Pointer;
    }
}
