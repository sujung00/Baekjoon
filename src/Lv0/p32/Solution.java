package Lv0.p32;

import java.util.Arrays;

// A로 B 만들기
class Solution {
    public int solution(String before, String after) {
        //순서 바꿔서 before -> after 가능 => 1 return
        //                          불가능 => 0 return

        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();

        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        if (Arrays.equals(beforeArr, afterArr)) return 1;
        else return 0;

    }
}
