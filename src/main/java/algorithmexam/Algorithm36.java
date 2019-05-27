package algorithmexam;

public class Algorithm36 {


    /*19.03.16 하샤드 수
    https://programmers.co.kr/learn/courses/30/lessons/12947?language=java

    양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
    예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
    자연수 n을 입력받아 n이 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.


     */

    class Solution {
        public boolean solution(int x) {
            String sx = String.valueOf(x);
            boolean answer = true;
            int sum = 0;
            for (int i = 0; i < sx.length(); i++) {
                sum += Integer.parseInt(sx.substring(i, i + 1));
            }
            if (x % sum != 0)
                answer = false;
            return answer;
        }
    }
}


