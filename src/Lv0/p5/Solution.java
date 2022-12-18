package Lv0.p5;

//문자열 밀기
class Solution {
    public int solution(String A, String B) {
        /*int answer = 0;

        String ssA = A;
        for (int i = 0; i < A.length(); i++) {
            if (ssA.equals(B)) {
                return answer;
            }
            //a => 맨 마지막 문자
            String a = ssA.substring(ssA.length()-1);
            //ssA.substring(0, ssA.length()-1) => 0부터 맨 마지막 글자 전까지
            ssA = a + ssA.substring(0, ssA.length()-1);
            //옮긴 횟수 증가
            answer++;
        }

        return -1;*/

        /*
        * 다른 사람 풀이
        */

        /**
         * repeat => String 문자열을 파라미터의 주어진 횟수만큼 반복
         * ex) A = hello
         * A.repeat(3) => hellohellohello
         *
         * 파라미터를 0으로 지정하면 빈 문자열을 반환
         *
         * 파라미터를 음수로 지정하면 IllegalArgumentExceptionthrow 에러를 반환
         *
         * 파라미터를 1로 지정하면 문자열을 그대로 반환
         *
         * 이 메서드는 내부적으로 Arrays.fill()및 System.arraycopy()메서드를 호출 하여 새 문자열을 만든다.
         * **/

        /**
         * indexOf => 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환
         *
         * 만약 찾지 못했을 경우 "-1"을 반환
         * **/

        String tempB = B.repeat(2);
        //tempB = ohellohell
        return tempB.indexOf(A);
        // A = hello
        // return 값 1
    }
}