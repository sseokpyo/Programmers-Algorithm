class Solution {
    public int solution(int a, int b) {        
        int gcd = gcd(a, b);
        a = a / gcd;
        b = b / gcd;        
        while(b != 1){
            if(b % 2 == 0){
                b/=2;
            } else if ( b % 5 == 0){
                b/=5;
            } else {
                return 2;
            }
        }
        
        return 1;
    }
    
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}n