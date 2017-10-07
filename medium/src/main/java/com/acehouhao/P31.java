package com.acehouhao;

/**
 * @author houhao
 */
public class P31 {
    public static void main(String[] args) {
        int[] nums = {7,7,9,8,6,6,8,7,9,8,6,6};
        System.out.println(partitionArray(nums, 10));
    }

    /*
     * @param nums: The integer array you should partition
     * @param k: An integer
     * @return: The index after partition
     */
    public static int partitionArray(int[] nums, int k) {
        // write your code here
        int i, j;
        for (i = 0, j = nums.length - 1; i < j; ) {
            if (nums[i] < k) {
                i++;
                continue;
            }
            if (nums[j] >= k) {
                j--;
                continue;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        if (j == nums.length - 1) {
            return nums.length;
        }
        return i;
    }
}
