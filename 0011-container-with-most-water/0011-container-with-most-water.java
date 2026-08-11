class Solution {
    public int maxArea(int[] height) {
        int i = 0 ; 
        int j = height.length-1;
        int maxArea = 0 ;
        while(i<j){
            int minh = Math.min(height[i] , height[j]);
            int dis = j-i;
            int curArea = minh*dis;
            maxArea=Math.max(maxArea,curArea);
            if(height[i] > height[j]) j--;
            else i++;
        }
        return maxArea;















        // int max = 0 ;
        // for(int i = 0 , j = height.length-1 ; i < j ;){
        //     int min = Math.min(height[i],height[j]);
        //     max = Math.max(max,min*(j-i));
        //     if(height[i] > height[j]) j--;
        //     else i++;
        // }
        // return max ;
    }
}