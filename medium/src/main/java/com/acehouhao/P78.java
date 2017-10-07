package com.acehouhao;

/**
 * @author houhao
 */
public class P78 {
    public static void main(String[] args) {
//        String[] strs = {"ABCDEFG", "ABCEFG", "ABCEFA"};
        String[] strs = {"a", "b"};
        System.out.println(longestCommonPrefix(strs));
    }

    /*
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public static String longestCommonPrefix(String[] strs) {
        // write your code here
        String ss = "";
        int length = Integer.MAX_VALUE;
        for (String str : strs) {
            if ("".equals(str)) {
                return str;
            }
            if (str.length() < length) {
                ss = str;
                length = str.length();
            }
        }
        for (int i = ss.length(); i > 0; --i) {
            ss = ss.substring(0, i);
            boolean iss = true;
            for (String str : strs) {
                if (str.indexOf(ss) == -1) {
                    iss = false;
                    break;
                }
            }
            if (iss) {
                return ss;
            }
        }

        return "";
    }
}
