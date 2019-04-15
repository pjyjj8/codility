package com.daou.codility.lesson2;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        int[] A = new int[]{9, 3, 9, 3, 9, 7, 9};
        long startTime = System.currentTimeMillis();
        System.out.println(solution(A));
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("solution : " + estimatedTime);
        startTime = System.currentTimeMillis();
        test(A);
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("test : " + estimatedTime);

    }

    public static int solution(int[] A) {

        int result = 0;
        for (int i = 0; i < A.length; i++) {
            boolean sameFlag = false;
            int sourceEl = A[i];
            for (int k = 0; k < A.length; k++) {
                int targetEl = A[k];
                if ((i != k) && sourceEl == targetEl) {
                    sameFlag = true;
                    break;
                }
            }
            if (!sameFlag) {
                result = sourceEl;
                break;
            }
        }
        return result;
    }

    private static void test(int[] A) {

    }


}
