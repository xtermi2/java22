package com.github.xtermi2.java22.jep458launchmultifilesource;

import java.util.Arrays;

/**
 * run this file vi e.g.
 * <p>
 * <code>java LaunchMultiFileSourceCodePrograms.java "1st arg" "2nd arg"</code>
 * <p>
 * this fails with a compile error on pre java 22
 * <p>
 * java 22 can read required java files in the same directory and compile them in memory to run this file
 */
public class LaunchMultiFileSourceCodePrograms {
    public static void main(String[] args) {
        Arrays.stream(args).forEach(arg -> {
            if (StringUtils.isBlank(arg)) {
                throw new IllegalStateException("args must not be blank!");
            }
            System.out.println("arg = " + arg);
        });
    }
}
