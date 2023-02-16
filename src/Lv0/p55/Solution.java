package Lv0.p55;

// 모음 제거
class Solution {
    public String solution(String my_string) {
        String answer = "";

        /*char[] strings = my_string.toCharArray();


        for (int i = 0; i < strings.length; i++){
            char a = strings[i];
            if (a != 'a' && a != 'e' && a != 'i' && a != 'o' && a != 'u'){
                answer += String.valueOf(a);
            }
        }*/

        answer = my_string.replaceAll("[aeiou]", "");

        return answer;
    }
}
