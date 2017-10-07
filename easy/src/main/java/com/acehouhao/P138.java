package com.acehouhao;

import java.util.ArrayList;
import java.util.List;

/**
 * @author houhao
 */
public class P138 {
    public static void main(String[] args) {
        int[] nums = {-3, 1, 2, -3, 4};
        List<Integer> list = subarraySum(nums);
        System.out.println("[" + list.get(0) + ", " + list.get(1) + "]");
    }

    /*
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number and the index of the last number
     */
    public static List<Integer> subarraySum(int[] nums) {
        // write your code here
        List<Integer> list = new ArrayList<>();
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        if (sum[0] == 0) {
            list.add(0);
            list.add(0);
            return list;
        }
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i-1] + nums[i];
            if (sum[i] == 0) {
                list.add(0);
                list.add(i);
                return list;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (sum[i] == sum[j]) {
                    list.add(i+1);
                    list.add(j);
                    return list;
                }
            }
        }
        return list;
    }
}
