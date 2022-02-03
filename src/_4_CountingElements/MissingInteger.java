package _4_CountingElements;

import java.util.Arrays;

public class MissingInteger {

    public static void main(String[] args) {
        int[] A = {-1,2, 3, 4, 5, 2};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int min = Integer.MAX_VALUE;
        boolean zeroNotReached = true;
        Arrays.sort(A);
        if (A[A.length - 1] <= 0 || (A[0] > 0 && A[0] != 1)) return 1;
        else {
            int i = A.length - 2;
            while (zeroNotReached && i >= 0) {
                if (A[i] <= 0 && A[i + 1] != 1) return 1;
                else if (A[i] <= 0 && A[i + 1] == 1) zeroNotReached = false;
                else if (A[i] > 0 && A[i + 1] > 0 && A[i + 1] - A[i] > 1)
                    min = Math.min(A[i] + 1, min);
                i--;
            }
        }
        return Math.min(min, ++A[A.length - 1]);
    }
}
