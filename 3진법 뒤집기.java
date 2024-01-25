class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = n;
        int l = 0;
        while(num / 3 != 0){
            num = num / 3;
            l++;
        }
        int t[] = new int[l+1];
        
        for(int i = l; i >= 0; i--){
            int x = 1;
            for(int j = 1; j <= i; j++){
                x = x * 3;
            }
            t[i] = n / x;
            n = n % x;
            
        }
        for(int i = 0; i < t.length; i++){
            int z = 1;
            for(int j = 0; j < t.length - i -1; j++){
                z = z * 3;
            }
            answer = answer + z*t[i];
        }
        return answer;
    }
}