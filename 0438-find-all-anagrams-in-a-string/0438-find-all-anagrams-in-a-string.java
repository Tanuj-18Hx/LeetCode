class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int l = 0 ; 
        int  k  = p.length();
        int [] p_tab = new int [26];
        int[] w_tab = new int [26] ;
        ArrayList<Integer> ans =  new ArrayList<>() ;

        for(char ch : p.toCharArray()){
            p_tab[ch - 'a']++ ;
        }


        for(int r = 0 ; r < s.length() ; r++){
            char ch_r = s.charAt(r) ;
            w_tab[ch_r - 'a']++;

            if(Arrays.equals(p_tab,w_tab)){
                ans.add(l);
            }


            if(r-l+1 == k ){
                char ch_l = s.charAt(l) ;
                w_tab[ch_l - 'a']-- ;


                l++;
            }
        }
        return ans;
    }
}