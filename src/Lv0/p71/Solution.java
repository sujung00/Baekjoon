package Lv0.p71;

import java.util.Arrays;

// 배열 자르기
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        /*int[] answer = new int[num2 - num1 + 1];

        for (int i = 0; i < answer.length; i++){
            answer[i] = numbers[num1+i];
        }

        return answer;*/

        return Arrays.copyOfRange(numbers, num1, num2+1);
    }
}