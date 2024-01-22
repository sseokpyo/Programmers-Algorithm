class Solution {
    public int[] solution(long n) {
        String num = String.valueOf(n);
        int[] answer = new int[num.length()];
        lfor(int i = 0; i < num.length(); i++){
            answer[i] = Integer.parseInt(num.substring(num.length() - i-1, num.length() - i));
        }
        return answer;
    }
}