package Lv0.p31;

// k의 개수*
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int a = i; a <= j; a++){
            int check = a;

            while (check != 0){
                if (check % 10 == k){
                    answer++;
                }
                check /= 10;
            }
        }

        return answer;
    }
}
