package algorithmexam;

public class Algorithm18 {
    /*짝수와 홀수
    https://programmers.co.kr/learn/courses/30/lessons/12937?language=java
    정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.
    */
    public String solution(int num) {
        String answer = "Odd";
        if(num % 2 == 0) {
            answer = "Even";
        }
        return answer;
    }
}
