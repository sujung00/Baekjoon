package Lv0.p26;

// 369게임
class Solution {
    public int solution(int order) {
        int answer = 0;

        String num = String.valueOf(order);
        for (int i = 0; i < num.length(); i++){
            int n = Integer.parseInt(String.valueOf(num.charAt(i)));
            if (n==3 || n == 6 || n==9) answer++;
        }

        return answer;
    }
}
