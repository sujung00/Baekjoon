package Lv0.p52;

import java.util.ArrayList;

// 소인수분해*
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        int idx = 2;
        while (n > 1) {
            if (n % idx == 0) {
                if (!answer.contains(idx)) {
                    answer.add(idx);
                }
                n /= idx;
            } else {
                idx++;
            }
        }

        return  answer.stream().distinct().mapToInt(Integer::intValue).toArray();
    }
}
