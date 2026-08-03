class Solution {
    public void moveZeroes(int[] nums) {
        // for(int i = 0 ; i < nums.length ; i++){
        //     for(int j = 0 ; j < nums.length-i-1 ; j++){
        //         if(nums[j]==0){
        //             int temp = nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = temp ;
        //         }
        //     }
        // }
        int left = 0 ; 
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] != 0 ){
                int temp = nums[i] ;
                nums[i] = nums[left];
                nums[left] = temp ;
                left ++;
            }
        }
        return ;
        // int i = -1 ;
        // for(int j = 0 ; j < nums.length ; j++){
        //     if(nums[j] != 0){
        //         i++;
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j]=temp;
        //     }
        // }
        // return ;
    }
}