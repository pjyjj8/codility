package com.daou.codility.lesson3;

public class FrogJmp {

    public static void main(String[] args) {
        int D = 10;
        int X = 10;
        int Y = 71;
        System.out.println(solution(X, Y, D));
    }

    public static int solution (int X, int Y, int D) {
        int jumpCnt = 0;
        int totalD = Y - X;
        jumpCnt = totalD / D;
        if (totalD % D != 0) {
            jumpCnt++;
        }
        return jumpCnt;
    }

}
