class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] score_sum = new double[score.length];        
        for(int i = 0; i < score.length; i ++){
            score_sum[i] = (score[i][0] + score[i][1]) / 2.0;            
        }
        
        for(int i = 0; i < score_sum.length; i++){
            answer[i] = 1;
            for(int j =0; j < score_sum.length; j++){
                if(score_sum[i] < score_sum[j]){
                    answer[i] = answer[i] + 1;
                }
            }
        }
        return answer;
    }
}