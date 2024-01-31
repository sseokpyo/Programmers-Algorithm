import java.util.ArrayList;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        ArrayList<Character> str = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){            
            if(str.indexOf(s.charAt(i)) == -1){
                answer[i] = -1;
                str.add(s.charAt(i));
            } else {                
                answer[i] = i - str.lastIndexOf(s.charAt(i));                
                str.add(s.charAt(i));
            }
        }
        System.out.println(str);
        return answer;
    }
}