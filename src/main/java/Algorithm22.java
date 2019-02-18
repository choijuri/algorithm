public class Algorithm22 {
    /*
     */
    class Solution {
        boolean solution(String s) {
            boolean answer = true;
            int p=0, y=0;

            for(int a=0; a<s.length(); a++) {
                if(s.charAt(a) == 'p' || s.charAt(a) == 'P') {
                    p++;
                }
                if(s.charAt(a) == 'y' || s.charAt(a) == 'Y') {
                    y++;
                }
            }

            if(p == y) {
                return answer;
            } else {
                answer = false;
                return answer;
            }

        }
    }
}
