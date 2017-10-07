package com.acehouhao;

import java.util.*;

/**
 * @author houhao
 */
public class P57 {
    public static void main(String[] args) {
        int[] numbers = {-1, 0, 1};
        //Set是怎么保证比如这种List<Integer>元素的不重复的呢！？
        Set<List<Integer>> ansSet = new HashSet<>();
        List<Integer> three = new ArrayList<>();
        three.add(-1);
        three.add(0);
        three.add(1);
        List<Integer> three1 = new ArrayList<>();
        three1.add(-1);
        three1.add(0);
        three1.add(1);
        ansSet.add(three);
        ansSet.add(three1);
        System.out.println(ansSet.size());
    }

    /*
     * @param numbers: Give an array numbers of n integer
     * @return: Find all unique triplets in the array which gives the sum of zero.
     */
    public static List<List<Integer>> threeSum(int[] numbers) {
        // write your code here
        Arrays.sort(numbers);
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> ansSet = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                for (int k = numbers.length - 1; k > j; k--) {
                    if (numbers[i] + numbers[j] + numbers[k] == 0) {
                        List<Integer> three = new ArrayList<>();
                        three.add(numbers[i]);
                        three.add(numbers[j]);
                        three.add(numbers[k]);
                        ansSet.add(three);
                    }
                }
            }
        }
        for (List<Integer> l : ansSet) {
            ans.add(l);
        }
        return ans;
    }
}
