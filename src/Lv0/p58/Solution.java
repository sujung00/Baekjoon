package Lv0.p58;

// 합성수 찾기
class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 0; i < n; i++){
            if (is_prime(i)){
                answer++;
            }
        }

        return n - answer - 1;
    }

    public boolean is_prime(int num){
        if (num < 2){
            return false;
        }

        if (num == 2){
            return true;
        }

        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }

        return true;
    }
}
