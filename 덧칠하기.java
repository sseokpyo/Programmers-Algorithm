class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] arr = new int[n];
        for(int i = 0; i < section.length; i++){            
            arr[section[i] - 1] = 1;
        }
        for(int i = 0; i < arr.length - m ; i++){
            if(arr[i] == 1){                
                for(int j = 0; j < m; j++){                    
                        arr[i + j] = 0;                        
                }
                answer++;
				
				
            }
        }
        for(int i = arr.length - m; i < arr.length; i++){
            System.out.println(arr[i]);
            if(arr[i] == 1){
                answer++;
                break;
            }
        }
        return answer;
    }
}

1 6 7 9 13 23 24 25 