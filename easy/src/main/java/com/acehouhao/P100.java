package com.acehouhao;

/**
 * @author houhao
 */
public class P100 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3};
        System.out.println(removeDuplicates(nums));
    }

    /*
     * @param nums: An ineger array
     * @return: An integer
     */
    public static int removeDuplicates(int[] nums) {
        // write your code here
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[j] == nums[i]) {
                j++;
                continue;
            } else {
                nums[i+1] = nums[j];
                i++;
                j++;
            }
        }
        return (i+1);
    }
}
