package _2_Arrays;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int A[] = new int[0];

        // 7 6 3 8 9

        System.out.println(Arrays.toString(solution(A, 4)));
    }

    public static int[] solution(int[] A, int K) {

        int length = A.length;
        if(length == 0) return A;

        K = K % length; // fix rotate;s
        if (K == 0) return A;

        int[] rotated = new int[length];

        for (int i = 0; i < length; i++) {
            rotated[i] = A[length - K];
            if (--K == 0 ) {
                K = length;
            }
        }

        return rotated;
    }
}
