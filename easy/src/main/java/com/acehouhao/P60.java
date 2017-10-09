package com.acehouhao;

/**
 * @author houhao
 */
public class P60 {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 6};
        int v = 5;
        System.out.println(searchInsert(A, v));
    }

    /*
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: An integer
     */
    public static int searchInsert(int[] A, int target) {
        // write your code here
        if (A.length == 0) {
            return 0;
        }
        int low = 0;
        int high = A.length - 1;
        int mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (A[mid] == target) {
                return mid;
            } else if (target > A[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (target > A[low]) {
            return low + 1;
        } else {
            return low;
        }
    }
}
