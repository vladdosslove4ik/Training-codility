package _3_TimeComplexity;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("work");
    }
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8

        int distance = Y - X;

        if (distance % D == 0) return distance / D;
        else return distance / D + 1;

    }
}
