package com.daou.codility.lesson3;

import java.util.Arrays;

public class PermMissingElem {

    public static void main(String[] args) {
        int[] A = new int[]{1,3,5,2};
        System.out.println(solution(A));
    }

    public static int solution_1 (int[] A) {
        int missingEl = 0;
        for (int n=1; n<=A.length; n++) {
            if (Arrays.binarySearch(A, n) < 0){
                missingEl = n;
            }
        }

        return missingEl;
    }

    /*
    20%
     */
    public static int solution_2 (int[] A) {
        int missingEl = 0;
        for (int n = 1; n <= A.length; n++) {
            boolean missingFlag = true;
            for (int el : A) {
                if (n == el) {
                    missingFlag = false;
                    break;
                }
            }
            if (missingFlag) {
                missingEl = n;
                break;
            }
        }
        return missingEl;
    }

    /*
    80%
     */
    public static int solution(int[] A) {
        // 가우스 덧셈
        int N = A.length+1;
        int nSum = (1 + N ) * N / 2;
        int ASum = 0;
        for (int el : A) {
            ASum += el;
        }
        return nSum - ASum;
    }
}
