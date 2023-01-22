package Lv0.p28;

// 삼각형의 완성조건(1)
//class Solution {
//    public int solution(int[] sides) {
//        int max = Integer.MIN_VALUE;
//        int sum = 0;
//        for (int i = 0; i < sides.length; i++){
//            if (max <= sides[i]) {
//                max = sides[i];
//            }
//            sum += sides[i];
//        }
//        if (max < sum - max) return 1;
//        else return 2;
//    }
//}

// 다른 풀이
import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        return sides[2] >= sides[0]+sides[1] ? 2 : 1;
    }
}