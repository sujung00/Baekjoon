package Lv0.p21;

// 한 번만 등장한 문자
class Solution {
    public String solution(String s) {
        String answer = "";
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 97] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 1) {
                answer += (char)(i + 97);
            }
        }
        return answer;
    }
}