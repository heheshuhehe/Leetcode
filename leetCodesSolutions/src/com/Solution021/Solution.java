package com.Solution021;

import com.DataStructure.ListNode;

import java.util.List;

public class Solution {

    public void start (String testCase){
        System.out.println(testCase);
        String[] arrays = (testCase.split("\n"));
        Solution2 solution = new Solution2();

        ListNode result = solution.solution2(ListNode.transferFromStringToNumList(null,arrays[0]),
                      ListNode.transferFromStringToNumList(null,arrays[1]));
        ListNode.printListNode(result);
    }

    public ListNode mergeTwoLists (ListNode l1, ListNode l2){
        ListNode.printListNode(l1);
        ListNode.printListNode(l2);

        if (l1==null) return l2;
        if (l2==null) return l1;

        ListNode head = new ListNode();
        ListNode Pointer = head;
        ListNode Previous = head;
        while (l1 != null || l2 != null){
            if (l1==null) {Pointer.val=l2.val; l2=l2.next;}
            else if (l2==null) {Pointer.val=l1.val; l1=l1.next;}
            else {
                Pointer.val = l1.val < l2.val ? l1.val : l2.val;
                if (l1.val < l2.val) l1 = l1.next;
                else l2 = l2.next;
            }
            Previous.next = Pointer;
            Previous = Pointer;
            Pointer = new ListNode();
        }
        return head;
    }



}
