package com.Solution013;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Start {
    public Start(String testCase) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        //int[] testNumArray = Arrays.stream(testCase.split(",")).mapToInt(Integer::parseInt).toArray();
        //System.out.println("The array is "+ Arrays.toString(testNumArray));
        Class<?> clazz = Class.forName(this.getClass().getName().replace("Start","Solution"));
        Method sameNameWithLeetCodeMethod = clazz.getMethod("romanToInt", String.class);
        Object result =sameNameWithLeetCodeMethod.invoke(clazz.getConstructor().newInstance(), testCase);
        System.out.println("The result of Question is "+result.toString());
    };
}
