package Lv0.p15;

// 숫자 찾기
class Solution {
    public int solution(int num, int k) {
        int answer = 0;

        String n = String.valueOf(num);
        for (int i = 0; i < n.length(); i++) {
            if (Integer.parseInt(String.valueOf(n.charAt(i))) == k){
                answer = i+1;
                break;
            }
        }
        if (answer == 0) {
            answer = -1;
        }

        return answer;
    }
}
