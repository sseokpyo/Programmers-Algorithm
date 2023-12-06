/*
소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다. 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다. 따라서 12의 소인수는 2와 3입니다. 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
*/
import java.util.ArrayList;
import java.util.List;


class Solution {
    public int[] solution(int n) {        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 2; i <= n; i++){
            if(n%i == 0){
                while(n%i == 0){
                    n = n / i;
                    System.out.println(n + " || " + i);
                }                
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}