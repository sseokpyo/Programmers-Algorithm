class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean check = false;
        int cnt = 1;
        String str = "";
        
        while(true){
            check = false;
            
            if(answer%3 == 0){
                answer++;
                check = true;
            }
            
            str = String.valueOf(answer);
            if(str.contains("3")){
                answer++;
                check = true;
            }
            
            if(check){
                continue;
            }
            
            if(cnt == n){
                break;
            }
            answer++;
            cnt++;
        }
        return answer;
    }
}