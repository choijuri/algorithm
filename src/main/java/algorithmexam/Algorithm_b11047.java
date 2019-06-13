package algorithmexam;

import java.util.Scanner;

public class Algorithm_b011047 {
    public static void main(String[] args) {
        int answer = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] v = new int[n];
        for(int i=0; i<n; i++){
            v[i] = sc.nextInt();
        }

        for(int i=n-1; i>=0; i--){
            answer += k/v[i];
            k %= v[i];
        }

        System.out.println(answer);
        sc.close();
    }
}
