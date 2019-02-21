public class Algorithm26 {
     /* 19.02.21 자연수 뒤집어 배열로 만들기
    https://programmers.co.kr/learn/courses/30/lessons/12932?language=java

    자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
    예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

     */
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
