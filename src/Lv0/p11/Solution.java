package Lv0.p11;

//문자열 안에 문자열
class Solution {
    public int solution(String str1, String str2) {

        if (str1.contains(str2)){
            return 1;
        } else {
            return 2;
        }
    }
}