package com.Solution239;

import com.DataStructure.TreeNode;

import java.util.*;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List <Integer> windows = new LinkedList<Integer>();
        List <Integer> result = new LinkedList <Integer>();
        List <Integer> sorted = new LinkedList <Integer>();

        for (int i=0; i< k; i++ ){
            windows.add(nums[i]);
        }
        sorted.addAll(windows) ;
        Collections.sort(sorted);
        result.add(sorted.get(k-1));
        for (int i=k; i< nums.length; i++ ){
            windows.remove(0);
            windows.add(nums[i]);
            sorted.clear();
            sorted.addAll(windows) ;
            // System.out.println(sorted.toString());
            Collections.sort(sorted);
            result.add(sorted.get(k-1));
        }
        return result.stream().mapToInt(Integer::valueOf).toArray();

    }
}
