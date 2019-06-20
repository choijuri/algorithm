package t_;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class t_멀리뛰기12914 {
    public long solution(int n) {
        long answer = 0;
        int[] arr = new int[n+1];
        if(n > 2){
            arr[1] = 1;
            arr[2] = 2;
            for(int i = 3; i <= n; i++){
                arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
            }
            answer = arr[n];
        } else {
            answer = n;
        }
        return answer;
    }


}


