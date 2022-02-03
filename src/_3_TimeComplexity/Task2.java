package _3_TimeComplexity;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        int[] massive = {};

        System.out.println(solution(massive));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8

        int l = A.length;
        Arrays.sort(A);
        if(l == 0) return 1;
        if(A[l-1] != l+1) return l+1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) return i + 1;
        }
        return A.length + 1;
    }
}
