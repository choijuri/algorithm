public class Algorithm24 {
     /* 19.02.19 약수의합
    https://programmers.co.kr/learn/courses/30/lessons/12928
    
    자연수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
     */
    class Solution {
        public int solution(int n) {
            int answer = 0;
            for(int i=1;i<=n;i++) {
                if(n%i==0)
                    answer += i;
            }
            return answer;
        }
    }
}
