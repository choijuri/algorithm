package algorithmexam;

public class Algorithm33 {
	/* 19.03.11   문자열 다루기 기본
	https://programmers.co.kr/learn/courses/30/lessons/12918?language=java
	
	문자열 s의 길이가 4혹은 6이고, 숫자로만 구성되있는지 확인해주는 함수, solution을 완성하세요.
	예를들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.
	*/

 public boolean solution(String s) {
      boolean answer = true;
      if(4==s.length() || s.length()==6) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) > '9')
                    answer = false;
            }
        }else {
            answer = false;
        }
      return answer;
  }
}
