package _5_PrefixSums;

public class CountDiv {

    public static void main(String[] args) {

        System.out.println(solution(4, 5, 3));
    }

    public static int solution(int A, int B, int K) {
        // write your code in Java SE 8

        while (A < B && A % K != 0) {
            A++;
        }
        while (B > A && B % K != 0) {
            B--;
        }

        if (A != B)
            return (B - A) / K + 1;
        else if (B % K == 0) return 1;
        else return 0;
    }
}
