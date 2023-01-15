package Lv0.p22;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//인덱스 바꾸기*
class Solution {
    public String solution(String my_string, int num1, int num2) {
//        String answer = "";
//
//        char n1 = my_string.charAt(num1);
//        char n2 = my_string.charAt(num2);
//
//        String answer1, answer2, answer3;
//        answer1 = my_string.substring(0, num1);
//        answer2 = my_string.substring(num1+1, num2);
//        answer3 = my_string.substring(num2+1);
//        answer = answer1 + n2 + answer2 + n1 + answer3;
//
//        return answer;

        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());

        Collections.swap(list, num1, num2);

        return String.join("", list);
    }
}