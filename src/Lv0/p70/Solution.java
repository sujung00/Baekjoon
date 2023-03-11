package Lv0.p70;

// 외계행성의 나이
class Solution {
    public String solution(int age) {
        String answer="";
        String ageStr= Integer.toString(age);
        for(int i=0; i<ageStr.length(); i++) {
            answer += (char)(ageStr.charAt(i)+49);
        }
        return answer;
    }
}

