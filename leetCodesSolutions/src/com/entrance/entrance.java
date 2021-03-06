package com.entrance;

import com.DataStructure.TreeNode;
import util.constants;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class entrance {


    /**
     *
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        String testString = readFileByChars("649.txt");
        Class<?> clazz = Class.forName("com.Solution649.Start");
        Constructor constructorStart = clazz.getConstructor(String.class);
        constructorStart.newInstance(testString);
    }



    /**
     *
     * @param fileName
     * @return th content inside the file
     */
    public static
    String readFileByChars(String fileName) {

        System.out.println("Reading test case path is "+System.getProperty(
                "user.dir")+ constants.MACTESTCASESPATH+fileName);
        String realFilename = System.getProperty(
                "user.dir")+constants.MACTESTCASESPATH+fileName;
        System.out.print("testCase content is: ");
        File file = new File(realFilename);
        Reader reader = null;
        StringBuilder resultString = new StringBuilder("");
        try {
//            System.out.println("以字符为单位读取文件内容，一次读多个字节：");
            // 一次读多个字符

            char[] tempchars = new char[1000];
            int charread = 0;
            reader = new InputStreamReader(new FileInputStream(realFilename));
            // 读入多个字符到字符数组中，charread为一次读取字符数
            while ((charread = reader.read(tempchars)) != -1) {
                // 同样屏蔽掉\r不显示
                if ((charread == tempchars.length)
                        && (tempchars[tempchars.length - 1] != '\r')) {
//                    System.out.print(tempchars);
                } else {
                    for (int i = 0; i < charread; i++) {
                        if (tempchars[i] == '\r') {
                            continue;
                        } else {
                            resultString.append(tempchars[i]);
                            System.out.print(tempchars[i]);
                        }
                    }
                }
            }
            System.out.println();
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    return resultString.toString();
    }


}
