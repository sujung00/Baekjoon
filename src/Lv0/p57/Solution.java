package Lv0.p57;

import java.util.Arrays;

// 최댓값 만들기(1)
class Solution {
    public int solution(int[] numbers) {
//        for (int i  = 0; i < numbers.length-1; i++){
//            for (int j = i+1; j < numbers.length; j++){
//                if (answer < numbers[i] * numbers[j]){
//                    answer = numbers[i]*numbers[j];
//                }
//            }
//        }
        Arrays.sort(numbers);

        return numbers[numbers.length-1]*numbers[numbers.length-2];
    }
}
