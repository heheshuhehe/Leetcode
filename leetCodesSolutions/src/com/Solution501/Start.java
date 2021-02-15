package com.Solution501;

import com.DataStructure.TreeNode;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Start {
    public Start(String testCase) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        int[] testNumArray = Arrays.stream(testCase.split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println("The array is "+ Arrays.toString(testNumArray));
        Class<?> clazz = Class.forName(this.getClass().getName().replace("Start","Solution"));
        Method startMethod = clazz.getMethod("findMode", TreeNode.class);
        startMethod.invoke(clazz.getConstructor().newInstance(), testNumArray);
    };
}
