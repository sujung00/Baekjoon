package Lv0.p9;

//세균 증식
class Solution {
    public int solution(int n, int t) {
        int answer = 0;

        answer += n;
        for (int i = 0; i < t; i++){
            answer *= 2;
        }

        return answer;
    }
}