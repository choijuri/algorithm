public class Algorithm04 {


    /* x만큼 간격이 있는 n개의 숫자 https://programmers.co.kr/learn/courses/30/lessons/12954?language=java

함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.


            입출력 예
            x	n	answer
            2	5	[2,4,6,8,10]
            4	3	[4,8,12]
            -4	2	[-4, -8]

*/


    class Solution {
        public long[] solution(int x, int n) {
            long[] answer = {};
            answer = new long[n];
            long num = 0;
            for (int i = 0; i < n; i++){
                num += x;
                answer[i] = num;
            }
            return answer;
        }
    }
}
