package Lv0.p54;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 문자열 정렬하기(1)
class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++){
            if (my_string.charAt(i) >= 48 && my_string.charAt(i) <= 57){
                list.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] += list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
