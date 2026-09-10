class Solution {
    public boolean possible(int[] piles , int h , int k){
        long ans = 0 ;
        for(int i = 0 ; i < piles.length ; i++){
            ans +=(int) Math.ceil((double)piles[i]/k);
        }
        return ans<=h ;

    }


    public int minEatingSpeed(int[] piles, int h) {

        int l = 1 ; 
        int r = 1000000000;
        int ans  = -1 ;

        while(l <= r){
            int mid = l + (r-l)/2 ; 

            if(possible(piles,h,mid)){
                ans = mid ;
                r = mid-1 ; 
            }else{
                l = mid +1 ;
            }
        }
return ans ;
    }
}