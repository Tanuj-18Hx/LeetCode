class Solution {
    public int search(int[] nums, int target) {
        int l = 0 ;
        int r = nums.length - 1;
        int pivot = 0 ;
        // while(l<=r){
        //     int mid = l + (r-l)/2 ;

        //     if(nums[mid] <= nums[r]){
        //         pivot = mid ;
        //         r = mid -1 ;
        //     }
        //     else l = mid + 1 ;
        // }
        while(l <= r){
        int mid = l + (r - l) / 2;
        if(nums[mid] >= nums[0]){
        l = mid + 1;
        } else {
            pivot = mid;
            r = mid - 1;
        }
        }
    

        l = 0 ;
        r = pivot - 1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                return mid ;
            }
            else if(nums[mid] < target) l = mid +1 ;
            else r = mid -1; 
        }

        l = pivot ;
        r = nums.length - 1;
        while(l<=r){
            int mid = l + (r-l)/2 ;
            if(nums[mid] == target) return mid ;
            else if(nums[mid] < target) l = mid +1 ;
            else r = mid -1; 
        }


        return -1 ;
    }
}