/*
정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
*/

class Solution {
    public int[] solution(int n) {        
        int size = 0;
        
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                size++;
            }
        }
        
        int[] answer = new int[size];
        for(int i = 0; i < size; i++){
            for(int j = 1; j <= n; j++){
                if(n % j == 0){
                    answer[i] = j;
                    i++;
                }
            }
        }
        return answer;
    }
}