import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        String[] s = new String[str.length()];
        for(int i = 0; i < str.length(); i++){
            s[i] = String.valueOf(str.charAt(i));
        }
        Arrays.sort(s);
        str = "";
        
        for(int i = s.length -1; i >= 0; i--){
            str = str + s[i];
        }
        System.out.println(str);
        answer = Long.parseLong(str);

        return answer;
    }
}