class Solution {
    public boolean checkDivisibility(int n) {
       int org = n ;
       int sum = 0 ;
       int prod = 1 ;
       while(n>0){
        int temp = n%10 ;
        sum += temp ;
        prod *= temp ;
        n/=10 ;
       } 
       int quot = sum + prod ;
       return org % quot ==  ;
    }
}