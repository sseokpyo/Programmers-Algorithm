class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++){
            for(int j = 0; j < str.length; j++){
                String s = (str[j]+str[j]);
                if(babbling[i].contains(s)){                    
                    break;
                } else if(babbling[i].contains(str[j])){
                    babbling[i] = babbling[i].replace(str[j], "1");
                }
            }
            babbling[i] = babbling[i].replace("1", "");
            System.out.println(babbling[i]);
            if(babbling[i] == ""){
                answer++;
            }
        }
        return answer;
    }
}
