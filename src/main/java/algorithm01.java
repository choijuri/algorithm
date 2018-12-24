
public class algorithm01 {

/*
제한 사항
입력된 수, num은 1 이상 8000000 미만인 정수입니다.

1-1. 입력된 수가 짝수라면 2로 나눕니다.
1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.

예를 들어, 입력된 수가 6이라면 6→3→10→5→16→8→4→2→1 이 되어 총 8번 만에 1이 됩니다.
위 작업을 몇 번이나 반복해야하는지 반환하는 함수, solution을 완성해 주세요.
단, 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.

* */




    class Solution {
        public int solution(int num) {
            int answer = 0;
            long lnum = num; //홀수일 경우 3을 곱학기 때문에 int 의 범위를 벗어날 수 있다.
            while(answer <= 500){
                if(lnum == 1){
                    return answer;
                }else if(lnum % 2 == 0){
                    lnum = lnum/2;
                    answer++;
                }else{
                    lnum = (lnum*3)+1;
                    answer++;
                }
            }
            return -1;
        }
    }
}
