package Lv0.p65;

// 가위 바위 보
class Solution {
    public String solution(String rsp) {
        String answer = "";

        for (int i = 0; i < rsp.length(); i++){
            if (rsp.charAt(i) == '2') answer += 0;
            else if (rsp.charAt(i) == '0') answer += 5;
            else if (rsp.charAt(i) == '5') answer += 2;
        }

        return answer;
    }
}
