package com.acehouhao;

import java.util.Arrays;

/**
 * @author houhao
 */
public class P158 {
    public static void main(String[] args) {
        System.out.println(anagram("abcd", "aabd"));
    }

    /**
     * @param s: The first string
     * @param t: The second string
     * @return true or false
     */
    public static boolean anagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        if (s.equals(t)) {
            return true;
        }

        String[] sa = s.split("");
        String[] ta = t.split("");
        Arrays.sort(sa);
        Arrays.sort(ta);

        for (int i = 0; i < sa.length; i++) {
            if (!sa[i].equals(ta[i])) {
                return false;
            }
        }
        return true;
    }
}
