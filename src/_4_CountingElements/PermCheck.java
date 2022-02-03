package _4_CountingElements;

import java.util.Arrays;

public class PermCheck {


    public int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);
        int temp = 0;
        for (int i : A) {
            if (i != temp) {
                temp = i;
            } else break;
        }

        if (temp == A.length) return 1;
        else return 0;
    }


}
