class Solution {
    public int lengthOfLastWord(String s) {
        String str=s.trim();
        int len=str.length();
        int i=0;
        while (len>0 && str.charAt(len-1) != ' '){
            i=i+1;
            len--;
        }
        return i;
    }
}
