package com.Solution239;

import com.DataStructure.TreeNode;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Start {
    public Start(String testCase) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        String[] lines = testCase.split("\n");
        int[] testNumArray = Arrays.stream(lines[0].split(",")).mapToInt(Integer::parseInt).toArray();
        int testK = Integer.parseInt(lines[1]);
        System.out.println("The array is "+ Arrays.toString(testNumArray));
        Class<?> clazz = Class.forName(this.getClass().getName().replace("Start","Solution"));
        Method beginMethod = clazz.getMethod("maxSlidingWindow", int[].class, int.class);
        Object result = beginMethod.invoke(clazz.getConstructor().newInstance(), testNumArray, testK);
        System.out.println("The result of Question is "+result.toString());
    };
}
