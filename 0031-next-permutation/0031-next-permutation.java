class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length - 1 ;
        int P = -1 ;
        for(int i = n-1 ; i>=0 ; i-- ){
            if(nums[i] >= nums[i+1]){
                continue ;
            }
            else {
                P=i;
                break ; 
            }
        }

        if( P == -1){
            int left = 0 ;
            int right = n ;
            while(left<right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp ;
                left ++;
                right -- ;
            }
            return ;
        }


        int k = 0 ;
        for(int j = n ; j>P ; j--){
            if(nums[j]>nums[P]){
                k=j;
                break ;
            }
        }
        int temp = nums[P];
        nums[P]=nums[k];
        nums[k] = temp ;

        P=P+1 ;
        while(P<n){
            int y = nums[P];
            nums[P]=nums[n];
            nums[n]=y;
            P++;
            n--;
        }
        return  ;
    }
}