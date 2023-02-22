package Lv0.p60;

// 배열 회전시키기
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        int n;
        if (direction.equals("left")){
            n = numbers[0];
            for (int i = 1; i < numbers.length; i++){
                answer[i-1] = numbers[i];
            }
            answer[numbers.length-1] = n;
        } else {
            n = numbers[numbers.length-1];
            for (int i = 0; i < numbers.length-1; i++){
                answer[i+1] = numbers[i];
            }
            answer[0] = n;
        }

        return answer;
    }
}
