/*
한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다. 다항식을 계산할 때는 동류항끼리 계산해 정리합니다. 덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때, 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요. 같은 식이라면 가장 짧은 수식을 return 합니다.
*/
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int y = 0;
        polynomial = polynomial.replace(" + ", " ");
        String[] str = polynomial.split(" ");        
        for(int i = 0; i < str.length; i++){
            if(str[i].contains("x")){                
                str[i] = str[i].replace("x","");                
                if(str[i] != ""){
                    x = x + Integer.valueOf(str[i]);
                } else {
                    x++;
                }                
            } else {
                y = y + Integer.valueOf(str[i]);
            }            
        }
        if(x == 0){
            answer = String.valueOf(y);
        } else if(x != 0 && y != 0){
            answer = x + "x + " + y;
            if(answer.substring(0, 2).equals("1x")){
                answer = answer.replace("1x", "x");
            }            
        } else if (x != 0 && y == 0){
            answer = x + "x";
            if(answer.substring(0, 2).equals("1x")){
                answer = answer.replace("1x", "x");
            }            
        }
        return answer;
    }
}