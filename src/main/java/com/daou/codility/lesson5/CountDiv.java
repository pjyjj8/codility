package com.daou.codility.lesson5;

public class CountDiv {


    /**
     * Task Score
     * 100%
     * Correctness
     * 100%
     * Performance
     * 100%
     *
     * https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/
     */

    public static int solution1(int A, int B, int K) {

        int countA = A / K;
        int countB = B / K;
        if (A % K == 0) {
            countB++;
        }
        return countB - countA;
    }

}
