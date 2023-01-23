package Lv0.p29;

import java.util.*;

// 중복된 문자 제거*
//class Solution {
//    public String solution(String my_string) {
//        char[] ch = my_string.toCharArray();
//        List<String> arr = new ArrayList();
//        for (int i = 0; i < my_string.length(); i++) {
//            if (!arr.contains(String.valueOf(ch[i]))) {
//                arr.add(String.valueOf(ch[i]));
//            }
//        }
//        return String.join("", arr);
//    }
//}

// 다른 풀이
class Solution {
    public String solution(String my_string) {
        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));

        return String.join("", set);
    }
}