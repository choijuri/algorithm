public class Algorithm22 {
    /* 19.02.17 문자열 내 p와 y의 개수
       https://programmers.co.kr/learn/courses/30/lessons/12916?language=java
       대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 
       같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 
       'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 
       단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

        예를들어 s가 pPoooyY면 true를 return하고 Pyy라면 false를 return합니다.

     */
    class Solution {
        boolean solution(String s) {
            boolean answer = true;
            int p=0, y=0;

            for(int a=0; a<s.length(); a++) {
                if(s.charAt(a) == 'p' || s.charAt(a) == 'P')
                    p++;
                if(s.charAt(a) == 'y' || s.charAt(a) == 'Y')
                    y++;
            }

            if(p == y)
                return answer;
            
            return answer;
            }

        }
    }
}
