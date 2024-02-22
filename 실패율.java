import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] score = new double[N];
        
        for(int i = 0; i < score.length; i++){
            double n = 0;
            double m = 0;
            for(int j = 0; j < stages.length; j++){
                if(stages[j] == i+1){
                    n++;                    
                }
                if(stages[j] >= i+1){
                    m++;                    
                }
            }            
            if(m != 0){
                score[i] = n / m;
            } else if (m == 0){
                score[i] = 0;
            }            
        }
        double[] sort_score = new double[N];
        System.arraycopy(score, 0, sort_score, 0, score.length);
        Arrays.sort(sort_score);
        reverseArray(sort_score);
        for(int i = 0; i < sort_score.length; i++){
            // System.out.println(sort_score[i]);
        }
        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < score.length; j++){
                if(sort_score[i] == score[j]){
                    score[j] = -1;
                    answer[i] = j+1;
                    break;
                }
            }
        }

        
        return answer;
    }
    
    public static void reverseArray(double[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            // 시작과 끝의 요소를 교환
            double temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            // 다음 요소로 이동
            start++;
            end--;
        }
    }
}