package Lv0.p10;

class Solution {
    public int solution(int n) {
/*        int answer = 0;

        //n 제곱수라면 1return 아니라면 2return
        for (int i = 0; i < n/2; i++){
            if (i * i == n){
                answer = 1;
                break;
            } else {
                answer = 2;
            }
        }

        return answer;*/

        //다른사람풀이
        //Math.sqrt(n) => n의 제곱근
        if (n % Math.sqrt(n) == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}