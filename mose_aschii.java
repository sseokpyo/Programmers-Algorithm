/*
머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다. 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다. 문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
모스부호는 다음과 같습니다.
*/
class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = { 
            ".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-",
            "-.--","--.."
        };
        
        int ascii = 97; /*아스키코드에서 a = 97*/
        String[] alphabet = letter.split(" ");
        for(int i = 0; i < alphabet.length; i++){
            // System.out.println(alphabet[i]);
            for(int j = 0; j < morse.length; j++){
                if(morse[j].equals(alphabet[i])){
                    answer = answer + (char)(j + ascii);
                }
            }
        }       
        
        return answer;
    }
}