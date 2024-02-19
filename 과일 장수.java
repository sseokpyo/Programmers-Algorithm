import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int[] rscore = new int[score.length];
        Arrays.sort(score);
        for(int i = 0; i < score.length; i++){
            rscore[score.length - 1 - i] = score[i];            
        }
        for(int i = m - 1 ;  i < rscore.length ; i = i + m){
            answer += (rscore[i] * m);
        }        
        return answer;
    }
}