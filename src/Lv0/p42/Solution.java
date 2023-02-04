package Lv0.p42;

// 외계어 사전*
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        for (String word : dic){
            boolean isRight = true;
            for (String spellS : spell){
                if (!word.contains(spellS)){
                    isRight = false;
                    break;
                }
            }

            if (isRight){
                answer = 1;
                break;
            }
        }

        return answer;
    }
}
