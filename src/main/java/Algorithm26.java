public class Algorithm26 {
    class Solution {
        public int[] solution(long n) {
            String a = String.valueOf(n);
            int[] answer = new int[a.length()];
            for(int i=0; i<answer.length; i++){
                answer[answer.length-1-i] = Integer.parseInt(a.substring(i,i+1));
            }
            return answer;
        }
    }
}
