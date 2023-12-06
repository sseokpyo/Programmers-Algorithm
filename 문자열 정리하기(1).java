/*
문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
*/
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {        
        my_string = my_string.replaceAll("[a-z]", "");          
        int[] answer = new int[my_string.length()];             
        
        for(int i = 0; i < my_string.length(); i++){
            answer[i] = Integer.valueOf(my_string.substring(i,i+1));
        }
        Arrays.sort(answer);
        
        return answer;
    }
}
