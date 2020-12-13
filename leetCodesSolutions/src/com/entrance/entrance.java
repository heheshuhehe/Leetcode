package com.entrance;

import com.Solution002.Solution002;
import com.Solution005.Solution;
import com.Solutions.Solution003;
import org.jetbrains.annotations.NotNull;
import util.constants;
import util.constants.*;
import java.io.*;

public class entrance {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        String testString = readFileByChars("005.txt");
        Solution solution = new Solution();
        System.out.println("the result of 005 is "+solution.longestPalindrome(testString));

//        System.out.println("The solution of the problem is " +  new Solution002(testString));
    }



    /**
     *
     * @param fileName
     * @return th content inside the file
     */
    public static @NotNull
    String readFileByChars(String fileName) {

        String realFilename = System.getProperty("user.dir")+constants.TESTCASESPATH+fileName;
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
//                            System.out.print(tempchars[i]);
                        }
                    }
                }
            }

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
