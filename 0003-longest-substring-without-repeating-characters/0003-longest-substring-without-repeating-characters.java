class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0 ;
        int max = 0 ;
        HashSet<Character> set = new HashSet<>(); 
        for(int r = 0 ; r < s.length() ; r++){
            char ch_r = s.charAt(r);


            while(set.contains(ch_r)){
                //shrinkiing
                char ch_l =s.charAt(l);
                set.remove(ch_l);
                l++;
            }

            //process

            set.add(ch_r);
            max = Math.max(max , r-l+1);
        }

        return max ;
    }
}