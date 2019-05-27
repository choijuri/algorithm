package algorithmexam;

import java.util.Arrays;

public class Algorithm27 {
    /* 19.02.22  문자열 내림차순으로 배치하기
  https://programmers.co.kr/learn/courses/30/lessons/12917?language=java
  문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수,
  solution을 완성해주세요.
  s는 영문 대소문자로만 구성되어 있으며,
  대문자는 소문자보다 작은 것으로 간주합니다.
  */
    class Solution {
        public String solution(String s) {
            String answer = "";
            String[] str = new String[s.length()];
            for(int i=0; i<s.length(); i++){
                str[i] = String.valueOf(s.charAt(i));
            }

            Arrays.sort(str);
            for(int i=str.length-1; i>=0; i--){
                answer += str[i];
            }
            return answer;
        }
    }
}
