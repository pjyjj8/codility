package com.daou.codility.lesson2;

public class CyclicRotation {

    public static void main(String[] args) {
        int K = 3;
        int[] A = new int[]{1,2,3,4,5};
        for (int a : A) {
            System.out.print(a + ", ");
        }
        System.out.println();
        A = solution(A, K);
        for (int a : A) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }

    private static int[] solution(int[] A, int K) {
        int[] result = new int[A.length];
        int count = K % A.length;

        int index = A.length-count;
        int a = 0;
        for (int i=index; i < A.length; i++) {
            result[a++] = A[i];
        }
        for (int k=0; k<index; k++) {
            result[a++] = A[k];
        }

        return result;

    }
}
