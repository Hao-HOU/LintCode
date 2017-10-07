package com.acehouhao;

/**
 * @author houhao
 */
public class P79 {
    public static void main(String[] args) {
        String A = "ABCD";
        String B = "CBCE";
        System.out.println(longestCommonSubstring(A, B));
    }

    /*
     * @param A: A string
     * @param B: A string
     * @return: the length of the longest common substring.
     */
    public static int longestCommonSubstring(String A, String B) {
        // write your code here
        if ("".equals(A) || "".equals(B)) {
            return 0;
        }
        int length = Integer.MIN_VALUE;
        int[][] c = new int[A.length()+1][B.length()+1];
        for (int i = 0; i < A.length() + 1; i++) {
            c[i][0] = 0;
        }
        for (int j = 1; j < B.length() + 1; j++) {
            c[0][j] = 0;
        }

        for (int i = 1; i < A.length()+1; i++) {
            for (int j = 1; j < B.length() + 1; j++) {
                if (A.charAt(i-1) == B.charAt(j-1)) {
                    c[i][j] = c[i-1][j-1] + 1;
                } else {
                    c[i][j] = 0;
                }
                length = Math.max(length, c[i][j]);
            }
        }


        return length;
    }
}
