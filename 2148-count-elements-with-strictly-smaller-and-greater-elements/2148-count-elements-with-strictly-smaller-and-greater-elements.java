class Solution {
    public int countElements(int[] nums) {
        

        int n = nums.length ;
        int min = Integer.MAX_VALUE ;
        int max = Integer.MIN_VALUE ;

        for(int i = 0 ; i < n ; i++){
            min = Math.min(min,nums[i]) ;
            max = Math.max(max,nums[i]) ;
        }
        int count = 0 ;

        for(int i = 0 ; i < n ; i++){
            if(nums[i] > min && nums[i] < max) count++ ;
        }

        return count ;
        
    }
}