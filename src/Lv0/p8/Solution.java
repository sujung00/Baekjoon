package Lv0.p8;

import java.util.Arrays;

//문자열 정렬하기(2)
class Solution {
    public String solution(String my_string) {
        String answer = "";

        //소문자로 정렬
        answer = my_string.toLowerCase();

        //알파벳 순서대로 정렬한 문자열을 return
        char[] stringChar = answer.toCharArray();
        Arrays.sort(stringChar);

        answer = new String(stringChar);

        return answer;
    }
}
