class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split("\\s+");
        int len = str.length;
        String s1 = str[len-1];
        return (s1.length());

    }
}