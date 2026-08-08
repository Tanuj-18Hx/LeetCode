class Solution {
    public int smallestNumber(int n, int t) {
        // int product =  1 ;
        // int temp = n ;
        // while(temp>0){
        //     product *= temp%10 ;
        //     temp/=10;
        //     if(product % t == 0){
        //         return n ;
        //     }else{
        //         n++;
        //         temp=n;
        //         product =1;
        //     }
        // }
        // return product ;


        while(true){
            int prod = 1 ;
            int temp = n ;
            while(temp>0){
                prod = prod * (temp%10);
                temp/=10;
            }
                if(prod%t==0) return n ;

                n++;
            
        }
    }
}