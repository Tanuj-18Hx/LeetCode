class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0 ;
        int max = 0 ;
        int count = 0 ;
        int [] freq = new int[26] ;
        for(int r = 0 ; r < s.length() ; r++){
            char ch_r = s.charAt(r);
            freq[ch_r - 'A']++;
            count = Math.max(count , freq[ch_r - 'A']) ;

            while(( (r-l+1) - (count) ) > k){  // we need to adjust window size with max  frequency


                char ch_l = s.charAt(l);
                freq[ch_l - 'A']--;
                l++;

                
            }
            max = Math.max(max , r-l+1) ;
        }
        return max ;
    }
}