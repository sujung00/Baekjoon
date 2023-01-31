package Lv0.p38;

// 유한소수 판별하기*
class Solution {
    public int solution(int a, int b) {
        int newB = b / gcd(a, b);

        while (newB != 1) {
            if (newB % 2 == 0) {
                newB /= 2;
            } else if (newB % 5 == 0) {
                newB /= 5;
            } else {
                return 2;
            }
        }

        return 1;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}

//class Solution {
//    public int solution(int a, int b) {
//        int answer = ((a*1000)%b == 0) ? 1 : 2;
//        return answer;
//    }
//}