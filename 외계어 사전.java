class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;        
        for(int i = 0; i < dic.length; i++){
            int[] spell_check = new int[spell.length];
            for(int j = 0; j < dic[i].length(); j++){                
                for(int k = 0; k < spell.length; k++){                    
                    String c = String.valueOf(dic[i].charAt(j));
                    if(spell[k].equals(c)){                        
                        spell_check[k] = 1;                        
                    }                    
                }                
            }
            int num = 0;
            for(int x = 0; x < spell_check.length; x++){
                num = num + spell_check[x];
            }

            if(num == spell.length){
                answer = 1;                
                break;
            } else {                
                answer = 2;
            }
        }        
        
        return answer;
    }
}