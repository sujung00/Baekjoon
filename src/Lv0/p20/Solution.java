package Lv0.p20;

import java.util.ArrayList;
import java.util.Arrays;

// 약수 구하기*
class Solution {
    public int[] solution(int n) {

        int sqrt = (int)Math.sqrt(n);
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= sqrt; i++){
            if (n % i == 0){
                arr.add(i);
                if (n / i != i) {
                    arr.add(n / i);
                }
            }
        }

        int[] answer = new int[arr.size()];
        for (int i = 0 ; i < arr.size(); i++){
            answer[i] += arr.get(i);
        }

        //오름차순 정렬
        Arrays.sort(answer);

        return answer;
    }
}
