class Solution {
    public boolean isAnagram(String s, String t) {
        // char[] a = s.toCharArray();
        // char[] b = t.toCharArray();
        // Arrays.sort(a);
        // Arrays.sort(b);
        // return Arrays.equals(a,b);

        int fre1 [] = new int [256] ;
        int fre2[] = new int [256] ;

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            fre1[ch]++;
        }

        for(int i = 0 ; i < t.length() ; i++){
            char ch = t.charAt(i);
            fre2[ch]++;
        }

        for(int i = 0 ; i < 256 ; i++){
          if(fre1[i] != fre2[i]) {
            return false ;
          }
        }
        return true ;
    }
}