package algorithmexam;

public class Algorithm35 {
    /* 19.03.13 JadenCase 문자열 만들기
    https://programmers.co.kr/learn/courses/30/lessons/12951?language=java

    JadenCase란 모든 단어의 첫 문자가 대문자이고,
    그 외의 알파벳은 소문자인 문자열입니다. 문자열 s가 주어졌을 때,
    s를 JadenCase로 바꾼 문자열을 리턴하는 함수,
    solution을 완성해주세요.

    제한 조건
    s는 길이 1 이상인 문자열입니다.
    s는 알파벳과 공백문자(" ")로 이루어져 있습니다.
    첫 문자가 영문이 아닐때에는 이어지는 영문은 소문자로 씁니다. ( 첫번째 입출력 예 참고 )

     */

    class Solution {
        public String solution(String s) {
            StringBuffer answer = new StringBuffer();
            int count =0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == ' '){
                    answer.append(s.charAt(i));
                    count =0;
                }else {
                    if(count ==0){
                        answer.append(Character.toUpperCase(s.charAt(i)));
                        count++;
                    }else {
                        answer.append(Character.toLowerCase(s.charAt(i)));
                    }
                }
            }
            return answer.toString();
        }
    }
}
