class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {

       int unpl = 0 ;
       for(int i = 0 ; i < fruits.length ; i++){
        boolean pl = false ;
        for (int j = 0 ; j < baskets.length ; j++){
            if(fruits[i] <= baskets[j]){
                pl = true ;
                baskets[j] = -1 ;
                break ;
            }
        }
        if(!pl) unpl++;
       } 
       
       return unpl ;
    }
}