package Lv0.p33;

// 이진수 더하기
class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";

        int b1, b2, sum;
        //10진수 변환
        b1 = Integer.parseInt(bin1, 2);
        b2 = Integer.parseInt(bin2, 2);
        //10진수 합
        sum = b1 + b2;

        //2진수 변환
        answer = Integer.toBinaryString(sum);

        return answer;
    }
}
