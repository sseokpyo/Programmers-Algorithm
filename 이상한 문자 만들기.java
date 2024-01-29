class Solution {
    public String solution(String s) {
        String answer = "";
        String list[] = s.split(" ",-1);
        for(int i = 0; i < list.length; i++){
            String str = "";
            for(int j = 0; j < list[i].length(); j++){
                if(j % 2 == 0){
                    str += String.valueOf(list[i].charAt(j)).toUpperCase();
                } else {
                    str += String.valueOf(list[i].charAt(j)).toLowerCase();
                }
            }
            System.out.println(str);
            if(i == 0){
                answer = answer + str;    
            } else {
                answer = answer + " " + str;
            }
            
        }
        return answer;
    }
}