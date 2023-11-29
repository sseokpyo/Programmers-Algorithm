/*
영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
- String[] array = my_string.toLowerCase().split("") : 문자 my_string을 소문자로 바꾸고(toLowerCse(*)) ""를 기준으로 배열에 저장(split(""))
- Arrays.sort : 오름차순 정렬
*/

import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";                
        String[] array = my_string.toLowerCase().split("");        
        Arrays.sort(array);
        
        for(int i = 0; i < my_string.length(); i++){
            answer += array[i];
        }
        
        return answer;
    }
}