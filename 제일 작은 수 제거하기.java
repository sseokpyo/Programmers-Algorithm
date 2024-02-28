import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];                
        ArrayList<Integer> list = new ArrayList<>(); // 타입 생략 가능
        if(answer.length == 0){
            answer = new int[1];
            answer[0] = -1;
        }
        int min = Arrays.stream(arr).min().getAsInt();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != min){
                list.add(arr[i]);                
            }            
        }
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}