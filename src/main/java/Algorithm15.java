public class Algorithm15 {
    /*주식가격 https://programmers.co.kr/learn/courses/30/lessons/42584

       초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때,
       가격이 유지된 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.

     */

    class Solution {
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];
            answer[prices.length-1] = 0;
            for(int i = 0; i<prices.length-1; i++ ){
                answer[i] = 1;
                for(int j=i+1; j<prices.length-1; j++){
                    if(prices[i] > prices[j]){
                        break;
                    }else{
                        answer[i]++;
                    }
                }
            }
            return answer;
        }
    }
}
