/*
정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
*/
class Solution {
    public int solution(int[] numbers) {
        int answer = -100000000;
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(answer < numbers[i] * numbers[j] && i != j){
                    answer = numbers[i] * numbers[j];
                }
            }
        }
        
        return answer;
    }
}