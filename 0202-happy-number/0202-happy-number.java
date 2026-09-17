class Solution {
    public boolean isHappy(int n) {
        int sum = 0 ;
        int rem  = 0 ;
        while(n > 0){
            while(n!=0){
                rem = n %10 ;
                sum += rem*rem ;
                n/=10 ;
            }
            if(sum == 4) break ;
            else if( sum ==1) return true ;
            else {
                n=sum ;
                sum = 0;
            } 
        }

        return false ;
    }
}