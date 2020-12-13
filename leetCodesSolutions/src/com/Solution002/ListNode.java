package com.Solution002;

import java.util.Optional;
import java.util.function.Supplier;

public class ListNode {

    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    ListNode(){ this.val=-1; this.next=null;}


}
