class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int allDate = 0;
        for(int i = 0; i < a-1; i++){
            allDate += month[i];
        }
        allDate += b;
        answer = day[(allDate + 4) % 7 ];        
        return answer;
    }
}