package Lv0.p39;

// 겹치는 선분의 길이*
class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[201];
        int answer = 0;
        for (int[] line : lines) {
            int a = line[0] + 100;
            int b = line[1] + 100;
            while (a<b) {
                if (++arr[a++] == 2) answer++;
            }
        }
        return answer;
    }
}