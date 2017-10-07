package com.acehouhao;

/**
 * @author houhao
 */
public class P13 {
    public static void main(String[] args) {
        System.out.println(strStr("source", "target"));
        System.out.println(strStr("abcdabcdefg", "bcd"));
    }

    /*
     * @param source: source string to be scanned.
     * @param target: target string containing the sequence of characters to match
     * @return: a index to the first occurrence of target in source, or -1  if target is not part of source.
     */
    public static int strStr(String source, String target) {
        if (target == null) {
            return -1;
        }
        if (target.equals("")) {
            return 0;
        }
        if (source == null || source.equals("")) {
            return -1;
        }
        return source.indexOf(target);
    }
}
