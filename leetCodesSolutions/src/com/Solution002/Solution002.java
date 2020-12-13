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
        printLinkedList(this.list1);
        printLinkedList(this.list2);
        this.addTwoNumbers(this.list1,this.list2);
    }

    /**
     *
     * @param l1, listNode1
     * @param l2, listNode2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1Num = l1.val;
        int l2Num = l2.val;
        int sum = l1Num+l2Num;
        int carry = 0;
        ListNode resultListNode = new ListNode();
        ListNode result = resultListNode;

        while (l1!=null || l2 !=null || carry>0){
            if (l1!=null){
                l1Num=l1.val;
                l1=l1.next;
                System.out.println("l1 is "+l1Num);
            }else {
                l1Num=0;
            }
            if (l2!=null){
                l2Num=l2.val;
                l2=l2.next;
                System.out.println("l2 is "+l2Num);
            }else {
                l2Num=0;
            }

            sum = (l1Num+l2Num+carry);
            resultListNode.val=sum%10;
            System.out.println("sum is "+sum);
            carry = sum>= 10 ? 1:0;
            sum=0;
            if (l1 == null && l2 == null && carry == 0) {
                resultListNode.next=null;
                break;
            }else {
                resultListNode.next= new ListNode(-1);
                resultListNode=resultListNode.next;
            }

        }
        System.out.print("the result is ");printLinkedList(result);
        return result;
    }

    public void printLinkedList (ListNode linkedList){
        ListNode printListNode = Optional.ofNullable(linkedList).orElse(new ListNode());
        StringBuilder toPrint = new StringBuilder("");
        while (printListNode!=null){
            toPrint.append(printListNode.val==-1?"bad end":printListNode.val+", ");
            printListNode=printListNode.next;
        }
        System.out.println(toPrint);
    }

}
