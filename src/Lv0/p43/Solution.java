package Lv0.p43;

// 삼각형의 완성조건(2)
class Solution {
    public int solution(int[] sides) {
        int answer = 0;

        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        // 만약 기존 요소 중 가장 긴 변이 있다면
        for (int i = max-min+1; i <= max; i++){
            answer++;
        }

        // 나머지 한 변이 가장 긴 변인 경우
        for (int i = max+1; i < max+min; i++){
            answer++;
        }

        return answer;
    }
}
