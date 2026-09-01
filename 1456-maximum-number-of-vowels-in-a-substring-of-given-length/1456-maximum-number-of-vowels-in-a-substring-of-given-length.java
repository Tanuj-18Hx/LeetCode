class Solution {
    public int maxVowels(String s, int k) {
        int  l = 0 ;
        int ans = 0 ;
        int count = 0 ;
        for(int r = 0 ; r < s.length() ; r++){
            char sr = s.charAt(r) ;
            if(sr=='a' || sr=='e' || sr=='i' || sr=='u' || sr=='o'){
                count++;
            }
            if(r-l + 1 == k){
                ans = Math.max(ans,count);
                char sl = s.charAt(l) ;
                if(sl=='a' || sl=='e' || sl=='i' || sl=='u' || sl=='o') count-- ;
                l++;
            }
        }
return ans;
        }
    }
