package com.acehouhao;

/**
 * @author houhao
 */
public class P59 {
    public static void main(String[] args) {

    }

    /*
     * @param numbers: Give an array numbers of n integer
     * @param target: An integer
     * @return: return the sum of the three integers, the sum closest target.
     */
    public int threeSumClosest(int[] numbers, int target) {
        // write your code here
        //先写个渣代码。渣代码竟然通过了！！！LintCode不计超时么？
//        int sum = 0;
//        int ans = 0;
//        int min = Integer.MAX_VALUE;
//        for (int i = 0 ; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                for (int k = j + 1; k < numbers.length; k++) {
//                    sum = numbers[i] + numbers[j] + numbers[k];
//                    if (min > Math.abs(sum - target)) {
//                        min = Math.abs(sum - target);
//                        ans = sum;
//                    }
//                }
//            }
//        }
//        return ans;

        //改进一下，试试两层循环.------------待改
        int sum = 0;
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    sum = numbers[i] + numbers[j] + numbers[k];
                    if (min > Math.abs(sum - target)) {
                        min = Math.abs(sum - target);
                        ans = sum;
                    }
                }
            }
        }
        return ans;
    }
}
