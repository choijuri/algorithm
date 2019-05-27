package algorithmexam;

import java.util.*;
public class Algorithm05 {
/* 자릿수 더하기 https://programmers.co.kr/learn/courses/30/lessons/12931?language=java

자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.


        입출력 예
        N	answer
        123	6
        987	24


*/

    public class Solution {
        public int solution(int n) {
            int answer = 0;
            int num = 0;

            while(n >= 10){
                num = n%10;
                answer += num;
                n = n/10;
            }
            return answer+n;
        }
    }

}
