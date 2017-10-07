package com.acehouhao;

/**
 * @author houhao
 */
public class P172 {
    public static void main(String[] args) {
        int[] A = {0,4,4,0,0,2,4,4};
        int elem = 4;
        System.out.println(removeElement(A, elem));
    }

    /*
     * @param A: A list of integers
     * @param elem: An integer
     * @return: The new length after remove
     */
    public static int removeElement(int[] A, int elem) {
        // write your code here
        int length = A.length;
        for (int i = 0; i < length;) {
            if (A[i] == elem) {
                if (A[length-1] != elem) {
                    A[i] = A[length-1];
                    i++;
                    length--;
                } else {
                    length--;
                }
            } else {
                i++;
            }
        }
        return length;
    }
}
