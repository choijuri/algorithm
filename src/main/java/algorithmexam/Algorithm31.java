package algorithmexam;

import java.util.Arrays;

public class Algorithm31 {
    /*19.03.07 정수 내림차순으로 배치하기
    https://programmers.co.kr/learn/courses/30/lessons/12933?language=java


    함수 solution은 정수 n을 매개변수로 입력받습니다. 
    n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
    예를들어 n이 118372면 873211을 리턴하면 됩니다.

     */

    public long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        Long[] l = new Long[s.length()];
        for(int i=0; i<s.length(); i++){
            l[i] = Long.parseLong(s.substring(i,i+1));
        }
        s="";
        Arrays.sort(l);
        for(int i=l.length-1; i >=0; i--){
            s+=l[i];
        }
        answer = Long.parseLong(s);
        return answer;
    }
}
