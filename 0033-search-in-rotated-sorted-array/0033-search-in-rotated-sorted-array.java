class Solution {

    public int BS(int nums[] , int trg , int start , int end ){
        int l = start ;
        int r = end ;
        int ans = -1 ;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid] == trg){
                ans = mid ;
                break ;
            }
            else if(nums[mid] < trg) l = mid+1 ;
            else r =mid -1 ;
        }
        return ans ;
    }

    public int mini(int arr[]){
        int l = 0 ;
        int r = arr.length -1 ;
        int last = arr[r];
        int ans = -1 ;
         while(l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid]<=last){
                ans =mid ;
                r = mid - 1;
            }
            else l = mid +1;
        }
        return ans ;
    }


    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length -  1 ;

int pivot = mini(nums) ;
int ans1 = BS(nums,target,0,pivot-1);
int ans2 = BS(nums,target,pivot,nums.length-1);
if(ans1==-1) return ans2 ;
if(ans2==-1) return ans1 ;
return -1;

    }

}