public class Algorithm29 {
  /* 19.03.04  시저암호
  https://programmers.co.kr/learn/courses/30/lessons/12926?language=java

어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. z는 1만큼 밀면 a가 됩니다.
문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
*/
  class Solution {
      public String solution(String s, int n) {
          String answer = "";
          char[] a = s.toCharArray();
          for(int i=0; i<a.length; i++) {
              if (a[i] != ' ') {
                  if ((a[i] < 91 && a[i] + n >= 91) || a[i] + n > 122) {
                      a[i] = (char) (a[i] + n - 26);
                  } else {
                      a[i] = (char) (a[i] + n);
                  }
              }
          }
          answer = String.valueOf(a);
          return answer;
      }
  }
}
