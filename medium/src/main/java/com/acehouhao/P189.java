package com.acehouhao;

import java.util.Arrays;

/**
 * @author houhao
 */
public class P189 {
    public static void main(String[] args) {
        int[] A = {1, 2};
        System.out.println(firstMissingPositive(A));
    }

    /*
     * @param A: An array of integers
     * @return: An integer
     */
    public static int firstMissingPositive(int[] A) {
        // write your code here
        Arrays.sort(A);
        int j = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= 0) {
                continue;
            }
            if (A[i] == j) {
                j++;
                continue;
            }
        }
        return j;
    }
}
