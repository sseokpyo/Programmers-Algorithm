class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        for ( long i = 1 ; i <= count; i++){
            sum += price * i;
        }

        System.out.println(sum);
        if(money > sum){
            answer = 0;
        } else {
            answer = sum - money;
        }
        return answer;
    }
}