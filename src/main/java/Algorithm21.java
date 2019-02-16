public class Algorithm21 {
    /*
     19.02.16 정수 제곱근 판별
    https://programmers.co.kr/learn/courses/30/lessons/12934?language=java
  
    임의의 정수 n에 대해, n이 어떤 정수 x의 제곱인지 아닌지 판단하려 합니다.
    n이 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, 
    n이 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
     */
    class Solution {
        public long solution(long n) {
            long answer = -1;
            long a = (long)Math.sqrt(n);

            if((a*a) == n){
                answer = (a+1)*(a+1);
            }
            return answer;
        }
    }

}
