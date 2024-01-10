import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {        
        double[] num = new double[numlist.length];
        
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] - n > 0){
                num[i] = Math.abs(numlist[i] - n);                
            } else {
                num[i] = Math.abs(numlist[i] - n) + 0.5;                
            }
            
        }
        
        Arrays.sort(num);
        for(int i = 0; i < numlist.length; i++){
            if(num[i] % 1 != 0){
                num[i] = Math.abs(num[i] - n - 0.5);
            } else {
                num[i] = num[i] + n;
            }
            numlist[i] = (int)num[i];
        }
        
        return numlist;
    }
}