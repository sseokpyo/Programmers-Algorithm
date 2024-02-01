import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int m = 0;
        int n = 0;
        for(int i = 0; i < goal.length; i++){
            if(Arrays.asList(cards1).indexOf(goal[i]) == m){
                m++;
            } else if (Arrays.asList(cards2).indexOf(goal[i]) == n){
                n++;
            } else {
                answer = "No";
            }
        }
        return answer;
    }
}