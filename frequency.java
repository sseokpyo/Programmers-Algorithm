class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] count = new int[1001];
        int max = 0;
        for(int i = 0; i < array.length; i++){
            count[array[i]] = count[array[i]] + 1;
        }
        for(int i = 0; i < count.length; i++){
            if(count[i] > max){
                max = count[i];
                answer = i;
            } else if (max == count[i]){
                answer = -1;
            }
        }
        return answer;
    }
}