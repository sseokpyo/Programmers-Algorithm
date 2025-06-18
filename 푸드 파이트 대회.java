class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i < food.length; i++){
            for(int j = 0; j < food[i] / 2; j++){
                answer = answer + i;
            }
        }
        String reverse = "";
        for(int i = answer.length() -1 ; i >= 0 ; i--){
            reverse = reverse + answer.charAt(i);
        }
        answer = answer + 0 + reverse;
        return answer;
    }
}