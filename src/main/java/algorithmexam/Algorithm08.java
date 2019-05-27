package algorithmexam;

public class Algorithm08 {

/* 나누어 떨어지는 숫자 배열  https://programmers.co.kr/learn/courses/30/lessons/12910

array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

        입출력 예
        arr	divisor	return
        [5, 9, 7, 10]	5	[5, 10]
        [2, 36, 1, 3]	1	[1, 2, 3, 36]
        [3,2,6]	10	[-1]
*/

class Solution {
        public int[] solution(int[] arr, int divisor) {
            int[] answer = {};
            int count = 0;


            //배열 생성을 하기 위해 count 수를 구한다.
            for (int i=0; i<arr.length; i++){
                if((arr[i]%divisor) == 0){
                    count++;
                }
            }

            //count로 배열 생성
            answer = new int[count];
            int j = 0;

            //생성한 배열에 값을 넣어준다
            for(int i=0; i<arr.length; i++ ){
                if((arr[i]%divisor) == 0){
                    answer[j]=arr[i];
                    j++;
                }
            }

            //배열의 오름차순 정렬
            for(int i=count-1; i>=0; i--){
                for(int a=0; a<i; a++) {
                    if(answer[a] > answer[a+1]) {
                        int tmp = answer[a];
                        answer[a] = answer[a+1];
                        answer[a+1] = tmp;

                    }
                }
            }

            if(count == 0){
                answer = new int[1];
                answer[0]= -1;
            }


            return answer;
        }

    }
}
