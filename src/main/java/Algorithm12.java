



public class Algorithm12 {
    /* 가운데 글자 가져오기  https://programmers.co.kr/learn/courses/30/lessons/12903

    단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.


    */

    class Solution {
        public String solution(String s) {
            String answer = "";
            int size = s.length();
            int num = 0;
            if((size%2) != 0){
                num = size/2 +1;
                answer = s.substring(num-1,num);
            }else{
                num = size/2;
                answer = s.substring(num-1,num+1);
            }
            return answer;
        }
    }
}
