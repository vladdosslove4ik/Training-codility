package _4_CountingElements;

import java.util.Arrays;

public class MaxCounters {
    public static void main(String[] args) {
        int[] A = {3,4,4,6,1,4,4};

        System.out.println(Arrays.toString(solution(5,A)));
    }

    public static int[] solution(int N, int[] A) {

        int[] array = new int[N];
        int currentMax = 0;
        int lastMaxCounter = 0;
        boolean wasNewMax = false;
        for (int i : A) {
            i--;
            if (i != N) {
                if(wasNewMax && lastMaxCounter > array[i]) {
                    array[i] = lastMaxCounter + 1;
                } else {
                    array[i]++;
                }

                if(array[i] > currentMax) {
                    currentMax = array[i];
                }
            } else {
                lastMaxCounter = currentMax;
                wasNewMax = true;

            }
        }
        for(int i=0; i<N; i++) {
            if(array[i] < lastMaxCounter) array[i] = lastMaxCounter;
        }
        return array;
    }

}
