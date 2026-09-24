class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length() ;

        if(n<26) return false ;

        int[] frq = new int[26] ;

        for(int i = 0 ; i < n ; i++){
            char  ch = sentence.charAt(i) ;
            frq[ch - 'a']++;
        }

        for(int i = 0 ; i < frq.length ; i++){
            if( frq[i] == 0) return false ;
        }

        return true ;
    }
}