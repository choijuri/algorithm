public class Algorithm17 {
/* 문자열 내 마음대로 정렬하기 https://programmers.co.kr/learn/courses/30/lessons/12915?language=java

 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때,
 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
  예를 들어 strings가 [sun, bed, car]이고 n이 1이면
  각 단어의 인덱스 1의 문자 u, e, a로 strings를 정렬합니다.

*/
    class Solution {
        public String[] solution(String[] strings, int n) {


            for (int i = 0; i < strings.length - 1; i++) {
                for (int j = i + 1; j < strings.length; j++) {
                    if (strings[i].charAt(n) > strings[j].charAt(n)) {
                        String temp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = temp;
                    } else if (strings[i].charAt(n) == strings[j].charAt(n)) {
                        if (strings[i].compareTo(strings[j]) > 0) {
                            String temp = strings[i];
                            strings[i] = strings[j];
                            strings[j] = temp;
                        }
                    }
                }
            }

            String[] answer = strings;
            return answer;
        }
    }
}
