package _5_PrefixSums;

import java.util.Arrays;

public class GenomicRangeQuery {

    public static void main(String[] args) {
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        System.out.println(Arrays.toString(solution("CAGCCTA", P, Q)));
    }

    public static int[] solution(String S, int[] P, int[] Q) {

        int n = P.length;
        int[] answers = new int[n];

        for (int i = 0; i < n; i++) {
            String subS = S.substring(P[i], Q[i]+1);

            if(subS.contains("A"))  answers[i] = 1;
            else if(subS.contains("C")) answers[i] = 2;
            else if(subS.contains("G")) answers[i] = 3;
            else answers[i] = 4;
        }
        return answers;
    }
}
