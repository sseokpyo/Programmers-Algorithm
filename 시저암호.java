class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                if(ch + n > 90){
                    ch = (char)(ch + n - 26);
                    answer = answer + ch;
                } else {
                    ch = (char)(ch + n);
                    answer = answer + ch;
                }
            } else if (Character.isLowerCase(ch)){
                if(ch + n > 122){
                    ch = (char)(ch + n - 26);
                    answer = answer + ch;
                } else {
                    ch = (char)(ch + n);
                    answer = answer + ch;
                }
            } else {
                answer = answer + ch;
            }
        }
        return answer;
    }
}