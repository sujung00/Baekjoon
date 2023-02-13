package Lv0.p51;

// 컨트롤 제트
class Solution {
    public int solution(String s) {
        int answer = 0;

        String[] strings = s.split(" ");
        int n;
        for (int i = 0; i < strings.length; i++){
            if (!strings[i].equals("Z")){
                n = Integer.parseInt(strings[i]);
                answer += n;
            } else {
                answer -= Integer.parseInt(strings[i-1]);
            }
        }

        return answer;
    }
}