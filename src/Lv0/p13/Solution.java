package Lv0.p13;

class Solution {
    public int solution(int n) {
        int answer = 0;

        String number = Integer.toString(n);
        for (int i = 0; i < number.length(); i++){
            answer += Integer.parseInt(number.substring(i, i+1));
        }

        return answer;
    }
}
