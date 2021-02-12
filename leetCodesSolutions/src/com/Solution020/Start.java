package com.Solution020;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Start {
    public Start(String testCase) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        //int[] testNumArray = Arrays.stream(testCase.split(",")).mapToInt(Integer::parseInt).toArray();
        //System.out.println("The array is "+ Arrays.toString(testNumArray));
        Class<?> clazz = Class.forName(this.getClass().getName().replace("Start","Solution"));
        Method sameNameWithLeetcodeMethod = clazz.getMethod("isValid", String.class);
        sameNameWithLeetcodeMethod.invoke(clazz.getConstructor().newInstance(), testCase);
    };
}
