import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {        
        int sum = 0;
		//test2
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(i != j){
                    sum = numbers[i] + numbers[j];
                    if(list.contains(sum) == false){
                        list.add(sum);    
                    }
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0;  i < answer.length; i++){
            answer[i] = list.get(i);            
        }        
        Arrays.sort(answer);
        return answer;
    }
}