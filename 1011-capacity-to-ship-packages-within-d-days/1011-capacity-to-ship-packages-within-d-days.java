class Solution {
    public boolean possible(int[]weights , int days , int cap){
        int useddays = 1 ;
        int curdays = 0; 
        for(int w : weights){
            if(curdays + w > cap){
                useddays++;
                curdays = 0 ;
            }
            curdays+=w; 
        }
        return useddays <= days ;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l = 0, r = 0;
        for (int w : weights) {
            l = Math.max(l, w);   
            r += w;               
        }
        int ans = -1 ;

        while(l<=r){
            int mid = l + (r-l)/2 ;

            if(possible(weights,days,mid)){
                ans = mid ;
                r = mid - 1;
            }
            else l = mid+1 ;
        }

        return ans ;
    }

}