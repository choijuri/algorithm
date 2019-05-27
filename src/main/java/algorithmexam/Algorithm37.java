package algorithmexam;
import java.util.Arrays;

public class Algorithm37 {
    /* 19.05.27 H-index
    https://programmers.co.kr/learn/courses/30/lessons/42747

    H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다.
    어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다.
    위키백과1에 따르면, H-Index는 다음과 같이 구합니다.

    어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면
    h가 이 과학자의 H-Index입니다.

    어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때,
    이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.
     */
    
    class Solution {
        public int solution(int[] citations) {
            int answer = 0;
            Arrays.sort(citations);
            int size = citations.length;
            int max = citations[size-1];


            for (int i = 0; i < max; i++) {
                int count = 0;
                for (int j = 0; j < size; j++) {
                    if (i <= citations[j]) {
                        count++;
                    }
                }
                if(count >= i) {
                    answer = i;
                }
            }
            return answer;
        }
    }
}
