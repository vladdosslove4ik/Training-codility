package _0_Challenge;

public class Solution {


    public static void main(String[] args) {
        String s = "abbbabb";
        System.out.println(solution(s));
    }


    public static String solution(String S) {
        // write your code in Java SE 8
        while (S.contains("abb")) {
            S = S.replaceFirst("abb", "baa");
        }
        return S;

    }


}