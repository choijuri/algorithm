package algorithmexam;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Algorithm_b1157 {
    /*19.07.08 단어공부
    https://www.acmicpc.net/problem/1157

   문제
    알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
    단, 대문자와 소문자를 구분하지 않는다.

   입력
    첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다.
    주어지는 단어의 길이는 1,000,000을 넘지 않는다.

   출력
    첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
    단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toUpperCase();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.replace(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }

        char cha = ' ';
        Integer max = Collections.max(map.values());
        for(Character c: map.keySet()) {
            if(map.get(c).equals(max)) {
                cha = c;
                map.remove(c);
                break;
            }
        }
        if(map.containsValue(max)){
            System.out.println("?");
        }else {
            System.out.println(cha);
        }

    }

}
