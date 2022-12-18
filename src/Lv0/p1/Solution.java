package Lv0.p1;

import java.util.Scanner;

public class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] say = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++){
            int count = babbling[i].length();
            for (int j = 0; j < say.length; j++){
                if (babbling[i].contains(say[j])) {
                    count -= say[j].length();
                }
            }
            if (count == 0) answer++;
        }

        return answer;
    }
}
