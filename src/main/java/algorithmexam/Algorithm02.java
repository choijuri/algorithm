package algorithmexam;

public class Algorithm02 {

/* 소수 찾기 https://programmers.co.kr/learn/courses/30/lessons/12921?language=java
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.(1은 소수가 아닙니다.)

    입출력 예 #1
    1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환

    입출력 예 #2
    1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환
*/



    class Solution {
        public int solution(int n) {
            int answer = 0;

            for(int i=2; i<=n; i++){
                int count = 0;
                for(int j=2; j<=Math.sqrt(i); j++){
                    if(i%j==0) {
                        count++;
                        break;
                    }
                } if(count==0) {
                    //System.out.println(i);
                    answer++;
                }
            }


            return answer;
        }
    }
}
