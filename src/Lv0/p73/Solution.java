package Lv0.p73;

//양꼬치
class Solution {
    public int solution(int n, int k) {
        int answer = (n*12000)+((k-(n/10))*2000);

        return answer;
    }
}
