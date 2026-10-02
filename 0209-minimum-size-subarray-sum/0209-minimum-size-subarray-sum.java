class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0 ;
        int sum = 0 ;
        int min = nums.length + 1 ;
        for(int r = 0 ; r < nums.length ; r++){
            // expansion
            sum = sum + nums[r] ;

            while(sum >= target){
                // update
                min = Math.min(min , r-l+1);

                //shrink

                sum = sum - nums[l]; 
                l++;
            }


        }
        return min == nums.length +1 ? 0 : min ;
    }
}