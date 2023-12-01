class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int mul = 0;
        if(denom1 > denom2){
            if(denom1%denom2 == 0){
                mul = denom1 / denom2;
                answer[0] = numer1 + numer2 * mul;
                answer[1] = denom1;
            } else{
                answer[0] = (numer1 * denom2) + (numer2 * denom1);
                answer[1] = denom1 * denom2;
            }
        }
        if(denom1 < denom2){
            if(denom2%denom1 == 0){
                mul = denom2 / denom1;
                answer[0] = numer2 + numer1 * mul;
                answer[1] = denom2;
            }
            else{
                answer[0] = (numer1 * denom2) + (numer2 * denom1);
                answer[1] = denom1 * denom2;
            }
        }
        return answer;
    }
}