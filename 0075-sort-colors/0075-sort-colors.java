class Solution {
    public void sortColors(int[] nums) {
        int l = 0 ; 
        int i = 0;
        int r = nums.length-1 ;
    while(i<=r){
        if(nums[i]==0){
            int t = nums[l] ;
            nums[l] = nums[i];
            nums[i] = t ;
            l++;
            i++;
        }
        else if(nums[i]==2){
            int y = nums[r];
            nums[r] = nums[i];
            nums[i] = y;
            r--;
        }
        else i++;
         }
         return ;
    }
}