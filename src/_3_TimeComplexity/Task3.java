package _3_TimeComplexity;

public class Task3 {

    public static void main(String[] args) {

        int[]A = {3, 1, 2, 4, 3};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8

        int[] summary = new int[A.length];

        int s = 0;
        for (int i = 0; i<A.length; i++) {
            s += A[i];
            summary[i] = s;
        }

        int dif = Integer.MAX_VALUE;
        for (int i = 1; i < A.length; i++) {
            int temp = Math.abs(s - summary[i-1]*2);
            if(temp == 0) return 0;
            if(temp < dif) dif = temp;
        }
        return dif;
    }
}
