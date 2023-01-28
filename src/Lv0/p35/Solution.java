package Lv0.p35;

// 로그인 성공?
class Solution {
    public String solution(String[] id_pw, String[][] db) {

        for (String[] user : db) {
            //id 일치
            if (id_pw[0].equals(user[0])) {
                //pw 일치
                if (id_pw[1].equals(user[1])) return "login";
                //pw 불일치
                else return "wrong pw";
            }
        }
        return "fail";
    }
}