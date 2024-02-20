class Solution {
    public int solution(int chicken) {
        int answer = 0;        
        int s = 0;
        while(chicken != 0){
            s = s + chicken % 10;
            chicken = chicken / 10;            
            answer = answer + chicken;
        }
        while(s >= 10){            
            int add = 0;
            add = s / 10;
            s = s % 10 + add;
            answer = answer + add;
        }
        
        return answer;
    }
}