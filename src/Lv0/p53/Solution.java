package Lv0.p53;

// 숨어있는 숫자의 덧셈(1)
class Solution {
    public int solution(String my_string) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++){
            if (my_string.charAt(i) >= 48 && my_string.charAt(i) <= 57){
                answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
            }
        }

        return answer;
    }
}
