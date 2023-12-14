/*
정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
*/
class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String[] arr = Integer.toString(num).split("");
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(Integer.toString(k))){
                answer = i+1;
                break;
            }
        }        
        if(answer == 0){
            answer = -1;
        }
        return answer;
    }
}