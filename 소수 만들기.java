import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int[] arr = new int[3];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    // System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                    list.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        System.out.println(list);
        for(int i = 0; i < list.size(); i++){
            for(int k = 2; k <= list.get(i); k++){
                if(k == list.get(i)){
                    answer++;
                } else if(list.get(i) % k == 0){
                    break;
                }
            }
        }

        return answer;
    }
}