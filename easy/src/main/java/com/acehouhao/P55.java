package com.acehouhao;

import java.util.Arrays;

/**
 * @author houhao
 */
public class P55 {
    public static void main(String[] args) {
        System.out.println(compareStrings("ABCD", "ACD"));
        System.out.println(compareStrings("ABCD", "AABC"));
        System.out.println(compareStrings("ABCD", ""));
        System.out.println(compareStrings("AAAAAAAAAABBBAAAAAAAAA", "BBBBAAAAAAAAA"));
    }

    /*
     * @param A: A string
     * @param B: A string
     * @return: if string A contains all of the characters in B return true else return false
     */
    public static boolean compareStrings(String A, String B) {
        if (B.length() > A.length()) {
            return false;
        }
        if (B.equals("")) {
            return true;
        }
        String[] bs = B.split("");
        String[] as = A.split("");
        Arrays.sort(bs);
        Arrays.sort(as);
        for (int i = 0, j = 0; i < bs.length && j < as.length;) {
            if (!bs[i].equals(as[j])) {
                j++;
                if (j == as.length) {
                    return false;
                }
            } else {
                i++;
                j++;
                if (j == as.length && i < bs.length) {
                    return false;
                }
            }
        }
        return true;
    }
}
