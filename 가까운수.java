/*
정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
*/
class Solution {
    public int solution(int[] array, int n) {        
        
        int answer = 0;
        int diff = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < array.length; i++){
            diff = Math.abs(n - array[i]);
            if(diff < min){
                min = diff;
                answer = array[i];
            } else if (diff == min && array[i] < answer ){
                answer = array[i];
            }
        }
        
        return answer;
    }
}