package com.acehouhao;

import java.util.ArrayList;
import java.util.List;

/**
 * @author houhao
 */
public class P50 {
    public static void main(String[] args) {

    }

    /*
     * @param nums: Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
        List<Long> longs = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            long mul = 1;
            for (int j = 0; j < nums.size(); j++) {
                if (i == j) {
                    continue;
                }
                mul = mul * nums.get(j);
            }
            longs.add(i, mul);
        }
        return longs;
    }
}
