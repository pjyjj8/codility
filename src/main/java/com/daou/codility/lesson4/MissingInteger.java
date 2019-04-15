package com.daou.codility.lesson4;

public class MissingInteger {

    public static void main(String[] args) {

        int[] A = new int[]{-1, -3};
        System.out.println(solution(A));


    }


    public static int solution(int[] A) {

        //Arrays.sort(A);
//        int min = A[0];
//        int max = A[A.length-1] + 1;
        int min = A[0];
        int max = A[0];
        for (int el : A) {
            if (max < el) {
                max = el;
            }
            if (min > el) {
                min = el;
            }
        }
        if (min < 0) {
            return 1;
        }

        max += 1;
        int smallest = min;
        boolean smallestFlag = false;
        while (smallest <= max ) {

            for (int idx=0; idx<A.length; idx++) {
                if (smallest == A[idx]) {
                    smallestFlag = false;
                    break;
                } else {
                    smallestFlag = true;
                }
            }
            if (smallestFlag) {
                return smallest;
            }
            smallest++;

        }
        return smallest;
    }


}
