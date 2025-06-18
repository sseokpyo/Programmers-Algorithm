import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        int[] score = new int[3];        
        int[] a = {1,2,3,4,5}; // 5
        int[] b = {2,1,2,3,2,4,2,5}; // 8
        int[] c = {3,3,1,1,2,2,4,4,5,5}; // 10
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == a[i % 5]){
                score[0]++;
            }
            if(answers[i] == b[i % 8]){
                score[1]++;
            }
            if(answers[i] == c[i % 10]){
                score[2]++;
            }            
        }
        
        int maxScore = Math.max(score[0], score[1]);
        maxScore = Math.max(maxScore, score[2]);
        
        System.out.println(maxScore);
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < 3; i++){
            if(maxScore == score[i]){
                list.add(i+1);
            }
        }
        
        return list;
    }
}