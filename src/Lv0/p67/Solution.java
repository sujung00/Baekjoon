package Lv0.p67;

// 개미군단
class Solution {
    public int solution(int hp) {
        return (hp / 5) + ((hp % 5) / 3) + ((hp % 5) % 3);
    }
}
