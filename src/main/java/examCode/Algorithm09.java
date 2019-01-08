package examCode;


/*평균구하기 https://programmers.co.kr/learn/courses/30/lessons/12944?language=java
정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.


 */
public class Algorithm09 {
    class Solution {
        public double solution(int[] arr) {
            double answer = 0;
            int len = arr.length;
            double sum =0;
            for(int i=0; i<len; i++){
                sum += arr[i];
            }
            answer = sum/len;
            return answer;
        }
    }
}
