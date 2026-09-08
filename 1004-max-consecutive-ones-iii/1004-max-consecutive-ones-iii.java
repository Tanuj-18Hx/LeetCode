class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0 ;
        int count_0 = 0 ; 
        int max = 0 ;

        for(int r = 0 ;r< nums.length ; r++){

            int c_r = nums[r] ;
            if(c_r == 0) count_0++;

            while(count_0 > k){
                int c_l = nums[l] ;
                if(c_l == 0 ) count_0-- ;
                l++;
            } 

            max = Math.max(max , r-l+1);
        }

        return max ;
    }
}