class Solution {
    public int numOfSubarrays(int[] arr) {
        long md = 1000000007 ;

        long ev = 1 ;
        long od = 0 ; 

        long ans = 0 ; 
        long sum = 0 ;

        for(int n : arr ){
            sum += n ;

            if(sum % 2 == 0){
                ans = (ans + od ) % md ;
                ev++ ; 
            }else {
                ans = (ans + ev) % md ;
                od++;
            }
        }

        return (int)ans ;
    }
}