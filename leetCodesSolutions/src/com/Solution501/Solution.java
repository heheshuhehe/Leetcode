package com.Solution501;

import com.DataStructure.TreeNode;
import com.sun.source.tree.Tree;

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int[] findMode (TreeNode root){
        HashMap <Integer,Integer> summary = getMode(new HashMap<>(), root);
        System.out.println(summary.toString());
        int max = 0;
        List<Integer> resultList= new LinkedList<>();
        for (Map.Entry<Integer,Integer> set: summary.entrySet()){
            if (max<set.getValue()){
                resultList.clear();
                resultList.add(set.getKey());
            }
            if (max==set.getValue()){
                resultList.add(set.getKey());
            }
            max=Math.max(set.getValue(),max);
        };
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

    public HashMap<Integer,Integer> getMode(HashMap<Integer,Integer> summary, TreeNode root){
        if (null==root) return summary;
        Integer counter=summary.get(root.val);
        System.out.println("root.val is "+root.val);
        if (counter!=null) summary.put(root.val,counter+1);
        else summary.put(root.val,1);
        summary=getMode(summary,root.left);
        summary=getMode(summary,root.right);
        return summary;
    }
}