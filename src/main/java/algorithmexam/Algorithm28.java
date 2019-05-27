package algorithmexam;

public class Algorithm28{
    /*19.02.23 최소공배수 최대공약수
    https://programmers.co.kr/learn/courses/30/lessons/12940?language=java

    두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
    배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
    예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다

     */

    class Solution {
        public int[] solution(int n, int m) {
            int[] answer = new int[2];
            int temp=1;
            int gcd=n*m;
            while(temp!=0){
                temp=m%n;
                m=n;
                n=temp;
            }
            answer[0]=m;
            answer[1]=gcd/m;
            return answer;
        }
    }
}
