package com.Solution021;

import com.DataStructure.ListNode;

public class Solution2 {
    public ListNode solution2 (ListNode l1, ListNode l2){
        l1.displayMyself();
        l2.displayMyself();
//        mergeTwoList(l1, l2);
        return mergeTwoList(l1, l2);
    }

    public ListNode mergeTwoList(ListNode l1, ListNode l2 ){
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoList(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoList(l1, l2.next);
            return l2;
        }

    }
}
