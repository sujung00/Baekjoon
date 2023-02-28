package Lv0.p66;

import java.util.HashMap;
import java.util.Map;

// 모스부호(1)
class Solution {
    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        Map<String, String> morse = new HashMap<>() {
            {
                put(".-", "a");
                put("-...", "b");
                put("-.-.", "c");
                put("-..", "d");
                put(".", "e");
                put("..-.", "f");
                put("--.", "g");
                put("....", "h");
                put("..", "i");
                put(".---", "j");
                put("-.-", "k");
                put(".-..", "l");
                put("--", "m");
                put("-.", "n");
                put("---", "o");
                put(".--.", "p");
                put("--.-", "q");
                put(".-.", "r");
                put("...", "s");
                put("-", "t");
                put("..-", "u");
                put("...-", "v");
                put(".--", "w");
                put("-..-", "x");
                put("-.--", "y");
                put("--..", "z");
            }
        };
        String[] letterArr = letter.split(" ");
        for (String word : letterArr){
            answer.append(morse.get(word));
        }

        return answer.toString();
    }
}
