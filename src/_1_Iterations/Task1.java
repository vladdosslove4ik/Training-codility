import static java.lang.Long.toUnsignedString;

public class Task1 {

    public static void main(String[] args) {

        System.out.println(solution(1041));
    }

    public static int solution(int N) {

        String s = toUnsignedString(N,2);
        int max = 0;
        for(int i = 1; i<s.length(); i++) {

            if(s.charAt(i)=='0') {
                int newmax = 0;
                while (s.charAt(i) == '0') {
                    newmax++;
                    if(++i >= s.length()) {
                        newmax = 0;
                        break;
                    }
                }
                max = Math.max(newmax, max);
            }
        }

        return max;
    }


}
