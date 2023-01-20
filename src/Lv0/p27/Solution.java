package Lv0.p27;

// 가까운 수
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;

        int min = Integer.MAX_VALUE;
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            if (a <= n) {
                if (min >= n - a) {
                    min = n - a;
                    num = i;
                }
            } else {
                if (min > a - n) {
                    min = a - n;
                    num = i;
                }
            }
        }
        answer = array[num];

        return answer;
    }
}