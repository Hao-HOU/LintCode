package com.acehouhao;

/**
 * @author houhao
 */
public class P64 {
    public static void main(String[] args) {
        int[] A = {1, 3, 4, 6, 0, 0};
        int[] B = {2, 5};
        mergeSortedArray(A, 4, B, 2);
        for (int i : A) {
            System.out.println(i);
        }
    }

    /*
     * @param A: sorted integer array A which has m elements, but size of A is m+n
     * @param m: An integer
     * @param B: sorted integer array B which has n elements
     * @param n: An integer
     * @return: nothing
     */
    public static void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                A[i] = B[i];
            }
        } else if (n == 0) {

        } else if (A[m-1] <= B[0]) {
            for (int i = 0; i < n; i++) {
                A[m++] = B[i];
            }
        } else if (B[n-1] <= A[0]) {
            for (int i = m - 1 + n; i >= n; i--) {
                A[i] = A[i-n];
            }
            for (int i = 0; i < n; i++) {
                A[i] = B[i];
            }
        } else {
            for (int i = m+n-1; i >= 0; i--) {
                if(m > 0 && n > 0 && A[m-1] >= B[n-1]) {
                    A[i] = A[m-1];
                    m--;
                } else if (n > 0) {
                    A[i] = B[n-1];
                    n--;
                }
            }
        }
    }
}
