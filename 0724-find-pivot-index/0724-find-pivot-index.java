class Solution {
    public int pivotIndex(int[] nums) {
        

        int total = 0 ; 

        for(int num : nums){
            total += num ;
        }

        int leftSum = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            int rightsum = total - leftSum - nums[i] ;

            if(leftSum == rightsum) return i ;

            leftSum += nums[i] ;
        }

        return -1 ;

    }
}