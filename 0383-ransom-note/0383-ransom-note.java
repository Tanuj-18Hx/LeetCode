class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int [] freq = new int[26];

       for(char c : magazine.toCharArray()){
        freq[c - 'a']++;
       } 

       for(char x : ransomNote.toCharArray()){
        if(freq[x -'a'] == 0) return false ;

        freq[x - 'a']--;
       }
       return true ;
    }
}