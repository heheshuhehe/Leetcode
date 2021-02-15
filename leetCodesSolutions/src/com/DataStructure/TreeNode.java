package com.DataStructure;

import com.sun.source.tree.Tree;

import javax.swing.text.html.Option;
import java.util.*;

/**
 * Definition for a binary tree node.
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    public TreeNode(){};

    public TreeNode parseStringToTreeNode (String testString) {
        String[] splitedString = testString.split(",");
        List<Integer> listInteger = new LinkedList<Integer>();
        for (String instance :Arrays.asList(splitedString)){
            listInteger.add(("".equals(instance) || "null".equals(instance))?null:Integer.valueOf(instance));
        }
        System.out.println("the list is "+listInteger.toString());
        return buildListToTreeNode(listInteger);
    }
        /**
         * from list to Tree
         * @param list
         * @return
         */
    public TreeNode buildListToTreeNode (List<Integer> list){
        Optional.ofNullable(list).orElseThrow();
        TreeNode treeNode= buildListToTreeNode(list,1);
        treeNode.PrintFromTopToBottom(treeNode);
        return buildListToTreeNode(list, 1);
    }

    /**
     * parse a List to TreeNode
     * @param list
     * @param count
     * @return
     */
     public TreeNode buildListToTreeNode (List<Integer> list,Integer count){
        if (count-1>=list.size() || list.get(count-1)==null) return null;
        System.out.println("count is " + count + "  list.(count-1) = " + list.get(count-1));
        TreeNode newNode = new TreeNode(list.get(count-1));
        newNode.val = list.get(count-1);
        newNode.left=buildListToTreeNode (list, count*2);
        newNode.right=buildListToTreeNode (list, count*2+1);
        return newNode;
    }

    /**
     * parse TreeNode into a list.
     * @param root
     * @return
     */
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> lists=new ArrayList<Integer>();
        if(root==null)
            return lists;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        int counter=0;
        while(!queue.isEmpty()){
            TreeNode tree=queue.poll();
            System.out.print(tree.val+", ");
            if(tree.left!=null)
                queue.offer(tree.left);
            if(tree.right!=null)
                queue.offer(tree.right);
            lists.add(tree.val);
        }
        return lists;
    }
}

