/*
문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
*/
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-z]", "");
        my_string = my_string.replaceAll("[A-Z]", "");
        int[] arr = new int[my_string.length()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.valueOf(my_string.substring(i, i+1));
        }
        for(int i =0; i < arr.length; i++){
            answer = answer + arr[i];
        }
        return answer;
    }
}