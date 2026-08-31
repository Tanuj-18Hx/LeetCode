class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0 ;
        int sum = 0 ;
        double ans = Integer.MIN_VALUE;
        
        for(int r  = 0 ; r < nums.length ; r++){
            sum+=nums[r];
            if(r-l+1 == k){
                ans = Math.max(ans,(double)sum/k);
                sum = sum-nums[l];
                l++;
            }
        }
        return ans ;
    }
}