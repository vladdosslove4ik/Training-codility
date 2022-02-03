package _5_PrefixSums;

import java.util.Arrays;

public class GenomicRangeQuery {

    public static void main(String[] args) {
        int[] P = {2, 5, 6, 0};
        int[] Q = {4, 5, 6, 8};
        System.out.println(Arrays.toString(solution("CAGCCTA", P, Q)));
    }

    public static int[] solution(String S, int[] P, int[] Q) {
        System.out.println('A' < 'T');

        int n = P.length;
        int[] answers = new int[n];

        for (int i = 0; i < n; i++) {

            int start = P[i];
            int end = Q[i];

            if (start == end) {
                answers[i] = impactFactor(S.charAt(start));
            } else {
                for (int j = start; j < end; j++) {
                    int impactFactor = impactFactor(S.charAt(j));
                    if (impactFactor == 1) {
                        answers[i] = impactFactor;
                        break;
                    } else if (impactFactor < answers[i] || answers[i] == 0)
                        answers[i] = impactFactor;
                }
            }
        }
        return answers;
    }

    public static int impactFactor(char l) {
        switch (l) {
            case ('A'):
                return 1;
            case ('C'):
                return 2;
            case ('G'):
                return 3;
            case ('T'):
                return 4;
        }
        return -1;
    }
}
