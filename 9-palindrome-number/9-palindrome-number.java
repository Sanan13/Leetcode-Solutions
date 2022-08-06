class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        int len=s.length()-1;
        int i;
        for(i=0;i<=len;i++){
            if(s.charAt(i)!=s.charAt(len-i)){
                return false;
                }
        }
        return true;
    }
}