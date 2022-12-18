package Lv0.p12;

//OX퀴즈
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] qStr =  quiz[i].split(" ");
            int n1 = Integer.parseInt(qStr[0]);
            int n2 = Integer.parseInt(qStr[2]);
            int n3 = Integer.parseInt(qStr[4]);
            if (qStr[1].equals("+")) {
                if (n1 + n2 == n3){
                    answer[i] = "O";
                } else answer[i] = "X";
            } else if (qStr[1].equals("-")){
                if (n1 - n2 == n3){
                    answer[i] = "O";
                } else answer[i] = "X";
            }
        }

        return answer;
    }
}
