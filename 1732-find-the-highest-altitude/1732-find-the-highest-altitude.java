class Solution {
    public int largestAltitude(int[] gain) {
        int res = 0 ;
        int curr = 0;
        int n = gain.length ;
        for(int i = 0 ; i < n ; i++){
            res += gain[i];
            curr = Math.max(curr,res);
        }
        return curr ;
    }
}