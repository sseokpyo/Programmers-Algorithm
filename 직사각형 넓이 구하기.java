/*
2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다. 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때, 직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
*/
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int min_x = dots[0][0];
        int max_x = dots[0][0];
        int min_y = dots[0][1];
        int max_y = dots[0][1];
        for(int i = 0; i < dots.length; i++){
            if(min_x < dots[i][0]){
                min_x = dots[i][0];
            }
            if(max_x > dots[i][0]){
                max_x = dots[i][0];
            }
            if(min_y < dots[i][1]){
                min_y = dots[i][1];
            }
            if(max_y > dots[i][1]){
                max_y = dots[i][1];
            }
        }
        
        answer = (max_x - min_x) * (max_y - min_y);
        
        return answer;
    }
}