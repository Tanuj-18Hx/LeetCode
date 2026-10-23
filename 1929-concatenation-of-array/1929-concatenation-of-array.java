class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length ;
        int [] ar = new int[n+n];

        for(int i = 0 ; i < ar.length ; i++){
            ar[i] = nums[i % n] ;
        }

        

        return ar ;
    }
}