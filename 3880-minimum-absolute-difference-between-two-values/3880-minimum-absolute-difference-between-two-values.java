class Solution {
    public int minAbsoluteDifference(int[] nums) {


     int dif = Integer.MAX_VALUE ;
     int lt = -1 ;

     int n = nums.length ;
     for(int i = 0 ; i < n ; i++){
        if(nums[i] != 0 ){
            if(lt != -1 && nums[lt] != nums[i]) {
                dif = Math.min(dif , i - lt) ;
            }
            lt = i ;
        }
     }   

     return dif == Integer.MAX_VALUE ? -1 : dif ;
     }
}