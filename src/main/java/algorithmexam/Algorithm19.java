package algorithmexam;

public class Algorithm19 {
/*
이상한 문자 만들기 https://programmers.co.kr/learn/courses/30/lessons/12930?language=java

문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

제한 사항
문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
*/

public String solution(String s) {
        StringBuffer sb = new StringBuffer();
        int count =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 32){
                sb.append(s.charAt(i));
                count = 0;
            }else{
                if(count%2 == 0){
                    sb.append(Character.toUpperCase(s.charAt(i)));

                }else {
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }count++;
            }
        }
        return sb.toString();
    }
}
