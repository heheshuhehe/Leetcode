package com.Solution501;

import com.DataStructure.TreeNode;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Start {
    public Start(String testCase) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        //int[] testNumArray = Arrays.stream(testCase.split(",")).mapToInt(Integer::parseInt).toArray();
        //System.out.println("The array is "+ Arrays.toString(testNumArray));
        TreeNode root = new TreeNode();
        root=root.parseStringToTreeNode(testCase);
        int i=0;
        Class<?> clazz = Class.forName(this.getClass().getName().replace("Start","Solution"));
        Method sameNameWithLeetCodeMethod = clazz.getMethod("findMode", TreeNode.class);
        Object result =sameNameWithLeetCodeMethod.invoke(clazz.getConstructor().newInstance(), root);
        if (result instanceof int[]){
            System.out.println("The result of Question is "+Arrays.toString( (int[])result));
        }
        System.out.println("The result of Question is "+result.toString());
    };
}
