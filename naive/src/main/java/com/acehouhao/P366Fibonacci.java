package com.acehouhao;

/**
 * @author houhao
 */
public class P366Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    /*
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public static int fibonacci(int n) {
        if (n <= 2) {
            return n-1;
        }
        int nextToLast = 0;
        int last = 1;
        int answer = 0;
        for (int i = 3; i <= n; i++) {
            answer = nextToLast + last;
            nextToLast = last;
            last = answer;
        }

        return answer;
    }
}
