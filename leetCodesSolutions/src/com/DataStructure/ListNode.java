package com.DataStructure;

import java.util.Optional;
import java.util.function.Supplier;

public class ListNode {

    public int val;
    public ListNode next;
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public ListNode(){}

    public void setVal(int val) {
        this.val = val;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    /**
     * create a new, int = -1 ListNode
     * @return
     */
    public ListNode createListNode(){
        ListNode newListNode = new ListNode();
        this.val=-1; this.next=null;
        return (newListNode);
    }

    /**
     * transfer a String of numbers to a link list
     * @param numLinkList
     * @param testCase
     * @return
     */
    public static ListNode transferFromStringToNumList(ListNode numLinkList,String testCase){
        if (null == testCase || "".equals(testCase)) return null;
        if (null == numLinkList ) numLinkList = new ListNode();
        ListNode Pointer = numLinkList;
        for (String numString: testCase.split(",")){
            Pointer.next = new ListNode(Integer.parseInt(numString));
            Pointer=Pointer.next;
        }
        return numLinkList.next;
    }

    /**
     * print a LinkList
     * @param listNode
     */
    public static void printListNode(ListNode listNode){
        if (null==listNode) {System.out.println("empty ListNode");return;}
        System.out.print("The ListNode is: ");
        while (listNode!=null){
            System.out.print(listNode.val + "->");
            listNode=listNode.next;
        }
        System.out.println();
    }

    /**
     * invoke this.printListNode
     */
    public void displayMyself () {
        printListNode(this);
    }

}
