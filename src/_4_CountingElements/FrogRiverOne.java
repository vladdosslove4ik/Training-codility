package _4_CountingElements;

public class FrogRiverOne {
    public static void main(String[] args) {
        int[] A = {1,3,1,4,2,3,5,4};
        int X = 5;
        System.out.println(solution(X,A));
    }

    public static int solution(int X, int[] A) {
        // write your code in Java SE 8
        boolean[]leafFalls = new boolean[X+1];
        int fallenLeaf = 0;
        for (int i = 0; i < A.length; i++) {

           if(!leafFalls[A[i]]) {
               leafFalls[A[i]] = true;
               fallenLeaf++;
               if(fallenLeaf == X) return i;
           }
        }
        return -1;
    }
}
