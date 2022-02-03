package _5_PrefixSums;

public class PassingCars {

    public static void main(String[] args) {

        int[] A = {1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {

        int numGoEast = 0;
        int pairs = 0;

        for (int j : A) {

            if (j == 0) numGoEast++;
            if (j == 1) pairs += numGoEast;
            if (pairs > 1000000000) return -1;
        }
        return pairs;
    }
}
