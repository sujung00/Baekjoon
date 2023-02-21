package Lv0.p59;

// 주사위의 개수
class Solution {
    public int solution(int[] box, int n) {
        int width = box[0];
        int height = box[1];
        int high = box[2];

        return (width/n)*(height/n)*(high/n);
    }
}
