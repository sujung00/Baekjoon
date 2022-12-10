package p4;

//종이 자르기
class Solution {
    public int solution(int M, int N) {
        int answer = 0;

        /*if (M > 1 || N > 1) {
            //세로로 자른 횟수 추가
            answer += M-1;
            //가로로 자른 횟수 추가
            answer += (N-1)*M;
        }*/

        answer = M*N-1;

        return answer;
    }
}